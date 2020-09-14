package com.zju.gcs.mapper;

import com.zju.gcs.model.DoctorDO;
import com.zju.gcs.model.DoctorDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorDOMapper {
    int countByExample(DoctorDOExample example);

    int deleteByExample(DoctorDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorDO record);

    int insertSelective(DoctorDO record);

    List<DoctorDO> selectByExample(DoctorDOExample example);

    DoctorDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoctorDO record, @Param("example") DoctorDOExample example);

    int updateByExample(@Param("record") DoctorDO record, @Param("example") DoctorDOExample example);

    int updateByPrimaryKeySelective(DoctorDO record);

    int updateByPrimaryKey(DoctorDO record);
}