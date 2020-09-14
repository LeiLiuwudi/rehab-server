package com.zju.gcs.mapper;

import com.zju.gcs.model.RecordDO;
import com.zju.gcs.model.RecordDOExample;
import java.util.List;

import com.zju.gcs.vo.HistoryRecordsVO;
import org.apache.ibatis.annotations.Param;

public interface RecordDOMapper {
    int countByExample(RecordDOExample example);

    int deleteByExample(RecordDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecordDO record);

    int insertSelective(RecordDO record);

    List<RecordDO> selectByExample(RecordDOExample example);

    RecordDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordDO record, @Param("example") RecordDOExample example);

    int updateByExample(@Param("record") RecordDO record, @Param("example") RecordDOExample example);

    int updateByPrimaryKeySelective(RecordDO record);

    int updateByPrimaryKey(RecordDO record);

    List<RecordDO> selectHistoryRecords(HistoryRecordsVO historyRecordsVO);
}