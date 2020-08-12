package com.zju.gcs.Controller;

import com.zju.gcs.common.exception.NirException;
import com.zju.gcs.common.exception.NirExceptionEnum;
import com.zju.gcs.common.result.Result;
import com.zju.gcs.common.result.ResultEnum;
import com.zju.gcs.model.UserDO;
import com.zju.gcs.service.UserService;
import com.zju.gcs.vo.LoginVO;
import com.zju.gcs.vo.RegisterVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<UserDO> login(@RequestBody LoginVO loginVO, HttpServletRequest request) {
        Result<UserDO> result = new Result<>();
        UserDO userDO = null;
        try {
            userDO = userService.getUser(loginVO, request);
        } catch (NirException e) {
            result.setCode(e.getCode());
            result.setMsg(e.getMessage());
            return result;
        } catch (Exception e) {
            result.setCode(NirExceptionEnum.GENERAL_EXCEPTION.getCode());
            result.setMsg(e.getMessage());
            result.setData(userDO);
            return result;
        }
        result.setData(userDO);
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        return result;
    }

    @PostMapping("register")
    public Result<Void> register(@RequestBody RegisterVO registerVO) {
        Result<Void> result = new Result<>();
        UserDO userDO = new UserDO();
        try {
            // 多余的参数没有补充 可以在构造函数里面加入
            BeanUtils.copyProperties(registerVO, userDO);
            userService.addUser(userDO);
        } catch (NirException e) {
            result.setCode(e.getCode());
            result.setMsg(e.getMessage());
            return result;
        } catch (Exception e) {
            result.setCode(NirExceptionEnum.GENERAL_EXCEPTION.getCode());
            result.setMsg(e.getMessage());
            return result;
        }
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        return result;
    }
}
