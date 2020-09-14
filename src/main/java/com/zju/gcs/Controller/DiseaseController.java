package com.zju.gcs.Controller;

import com.zju.gcs.common.exception.NirExceptionEnum;
import com.zju.gcs.common.result.Result;
import com.zju.gcs.common.result.ResultEnum;
import com.zju.gcs.model.DiseaseDO;
import com.zju.gcs.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/disease")
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @PostMapping("/all")
    public Result<List<DiseaseDO>> getDisease() {
        Result<List<DiseaseDO>> result = new Result<>();
        List<DiseaseDO> diseaseList;
        try {
            diseaseList = diseaseService.getDisease();
        } catch (Exception e) {
            result.setCode(NirExceptionEnum.GENERAL_EXCEPTION.getCode());
            result.setMsg(e.getMessage());
            return result;
        }
        result.setData(diseaseList);
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        return result;
    }
}
