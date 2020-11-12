package com.zju.gcs.service;

import com.zju.gcs.model.GetpatientDO;
import com.zju.gcs.model.PatientDO;
import com.zju.gcs.vo.AddPatientVO;
import com.zju.gcs.vo.GetPatientVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    void addPatient(PatientDO patientDO);

    List<GetpatientDO> getPatient(GetPatientVO getPatientVO);

    void updatePatient(PatientDO patientDO);
}
