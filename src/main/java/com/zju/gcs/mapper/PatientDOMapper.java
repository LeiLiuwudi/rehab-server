package com.zju.gcs.mapper;

import com.zju.gcs.model.PatientDO;
import com.zju.gcs.model.PatientDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientDOMapper {
    int countByExample(PatientDOExample example);

    int deleteByExample(PatientDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PatientDO record);

    int insertSelective(PatientDO record);

    List<PatientDO> selectByExample(PatientDOExample example);

    PatientDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PatientDO record, @Param("example") PatientDOExample example);

    int updateByExample(@Param("record") PatientDO record, @Param("example") PatientDOExample example);

    int updateByPrimaryKeySelective(PatientDO record);

    int updateByPrimaryKey(PatientDO record);
}