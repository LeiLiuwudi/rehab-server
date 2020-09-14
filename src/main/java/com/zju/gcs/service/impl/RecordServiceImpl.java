package com.zju.gcs.service.impl;

import com.zju.gcs.mapper.PatientDOMapper;
import com.zju.gcs.mapper.RecordDOMapper;
import com.zju.gcs.model.PatientDO;
import com.zju.gcs.model.RecordDO;
import com.zju.gcs.service.RecordService;
import com.zju.gcs.vo.HistoryRecordsVO;
import com.zju.gcs.vo.UploadRecordVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Value("${rehab.file.location}")
    private String BASE_PATH;

    @Autowired
    private RecordDOMapper recordMapper;

    @Autowired
    private PatientDOMapper patientMapper;

    @Override
    public List<RecordDO> getHistoryRecords(HistoryRecordsVO historyRecordsVO) {
        return recordMapper.selectHistoryRecords(historyRecordsVO);
    }

    @Override
    public void uploadRecord(UploadRecordVO uploadRecordVO) throws IOException {
        RecordDO recordDO = new RecordDO();
        PatientDO patientDO = new PatientDO();
        BeanUtils.copyProperties(uploadRecordVO,recordDO);
        BeanUtils.copyProperties(uploadRecordVO,patientDO);
        patientDO.setId(uploadRecordVO.getPatientId());
        PatientDO existPatient = patientMapper.selectByPrimaryKey(uploadRecordVO.getPatientId());
        if (existPatient != null) {
            patientMapper.updateByPrimaryKeySelective(patientDO);
        } else {
            patientMapper.insertSelective(patientDO);
        }
        String infraPath = addFile(uploadRecordVO.getInfraFile());
        recordDO.setInfraPath(infraPath);
        recordMapper.insertSelective(recordDO);
    }

    @Override
    public String addFile(MultipartFile file) throws IOException {
        if (file == null) {
            return "";
        }
        String fileName = file.getOriginalFilename();
        String fullPath = BASE_PATH + File.separator + fileName;
        File newFile = new File(fullPath);
        if(!newFile.getParentFile().exists()){
            newFile.getParentFile().mkdirs();
        }
        file.transferTo(newFile);
        return fileName;
    }
}
