package com.zju.gcs.service;

import com.zju.gcs.model.PatientDO;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {
    void addPatient(PatientDO patientDO);
}
