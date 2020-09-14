package com.zju.gcs.service.impl;

import com.zju.gcs.mapper.DiseaseDOMapper;
import com.zju.gcs.model.DiseaseDO;
import com.zju.gcs.model.DiseaseDOExample;
import com.zju.gcs.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    private DiseaseDOMapper diseaseMapper;

    @Override
    public List<DiseaseDO> getDisease() {
        DiseaseDOExample doExample = new DiseaseDOExample();
        return diseaseMapper.selectByExample(doExample);
    }
}
