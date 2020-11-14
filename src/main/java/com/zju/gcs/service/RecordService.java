package com.zju.gcs.service;

import com.zju.gcs.model.HistoryRecordDO;
import com.zju.gcs.model.RecordDO;
import com.zju.gcs.vo.HistoryRecordsVO;
import com.zju.gcs.vo.UploadRecordVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface RecordService {

    void uploadRecord(UploadRecordVO uploadRecordsVO) throws IOException;

    String addFile(MultipartFile file,Integer param) throws IOException;


    List<HistoryRecordDO> getHistoryRecords(HistoryRecordsVO historyRecordsVO);
}
