package com.zju.gcs.service.impl;

import com.zju.gcs.common.exception.NirException;
import com.zju.gcs.common.exception.NirExceptionEnum;
import com.zju.gcs.common.util.MD5Util;
import com.zju.gcs.mapper.UserDOMapper;
import com.zju.gcs.model.UserDO;
import com.zju.gcs.model.UserDOExample;
import com.zju.gcs.service.UserService;
import com.zju.gcs.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDOMapper userMapper;

    @Override
    public UserDO getUser(LoginVO loginVO, HttpServletRequest request) {
        String name = loginVO.getUsername();
        String pwd = MD5Util.md5Encode(loginVO.getPassword());
        HttpSession session = request.getSession();
        loginVO.setPassword(pwd);
        UserDOExample example = new UserDOExample();
        example.createCriteria().andUsernameEqualTo(name).andPasswordEqualTo(pwd);

        List<UserDO> users = userMapper.selectByExample(example);

        if (CollectionUtils.isEmpty(users)) {
            throw new NirException(NirExceptionEnum.NO_USER_FOUND);
        }

        UserDO user = users.get(0);

        session.setAttribute("userId", user.getId());

        return user;
    }

    @Override
    public void addUser(UserDO userDO) {
        String username = userDO.getUsername();
        String password = MD5Util.md5Encode(userDO.getPassword());
        UserDOExample example = new UserDOExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UserDO> users = userMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(users)) {
            throw new NirException(NirExceptionEnum.USER_EXIST);
        }
        else{
            userDO.setPassword(password);
            userMapper.insert(userDO);
        }
    }
}
