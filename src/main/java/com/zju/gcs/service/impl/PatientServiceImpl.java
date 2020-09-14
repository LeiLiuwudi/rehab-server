package com.zju.gcs.service.impl;

import com.zju.gcs.common.exception.NirException;
import com.zju.gcs.common.exception.NirExceptionEnum;
import com.zju.gcs.mapper.PatientDOMapper;
import com.zju.gcs.model.PatientDO;
import com.zju.gcs.model.PatientDOExample;
import com.zju.gcs.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDOMapper patientMapper;

    @Override
    public void addPatient(PatientDO patientDO) {
        Integer id = patientDO.getId();
        PatientDOExample example = new PatientDOExample();
        example.createCriteria().andIdEqualTo(id);
        List<PatientDO> patients = patientMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(patients)) {
            throw new NirException(NirExceptionEnum.PATIENT_EXIST);
        }
        else{
            patientMapper.insert(patientDO);
        }
    }
}
