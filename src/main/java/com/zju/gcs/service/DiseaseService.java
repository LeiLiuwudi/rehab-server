package com.zju.gcs.service;

import com.zju.gcs.model.DiseaseDO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiseaseService {
    List<DiseaseDO> getDisease();
}
