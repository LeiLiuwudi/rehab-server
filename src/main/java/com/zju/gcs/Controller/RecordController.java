package com.zju.gcs.Controller;

import com.zju.gcs.common.exception.NirExceptionEnum;
import com.zju.gcs.common.result.Result;
import com.zju.gcs.common.result.ResultEnum;
import com.zju.gcs.model.RecordDO;
import com.zju.gcs.service.PatientService;
import com.zju.gcs.service.RecordService;
import com.zju.gcs.vo.HistoryRecordsVO;
import com.zju.gcs.vo.UploadRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @PostMapping("getHistoryRecords")
    public Result<List<RecordDO>> getHistoryRecords(@RequestBody HistoryRecordsVO historyRecordsVO) {
        Result<List<RecordDO>> result = new Result<>();
        List<RecordDO> diseaseList;
        try {
            diseaseList = recordService.getHistoryRecords(historyRecordsVO);
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
    @PostMapping("uploadRecord")
    @Transactional
    public Result<Void> uploadRecord(UploadRecordVO uploadRecordVO) {
        Result<Void> result = new Result<>();
        try {
            Date date = new Date(System.currentTimeMillis());
            uploadRecordVO.setCreatedAt(date);
            recordService.uploadRecord(uploadRecordVO);
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
