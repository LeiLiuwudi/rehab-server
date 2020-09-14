package com.zju.gcs.mapper;

import com.zju.gcs.model.DiseaseDO;
import com.zju.gcs.model.DiseaseDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiseaseDOMapper {
    int countByExample(DiseaseDOExample example);

    int deleteByExample(DiseaseDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiseaseDO record);

    int insertSelective(DiseaseDO record);

    List<DiseaseDO> selectByExample(DiseaseDOExample example);

    DiseaseDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DiseaseDO record, @Param("example") DiseaseDOExample example);

    int updateByExample(@Param("record") DiseaseDO record, @Param("example") DiseaseDOExample example);

    int updateByPrimaryKeySelective(DiseaseDO record);

    int updateByPrimaryKey(DiseaseDO record);
}