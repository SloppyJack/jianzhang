package com.example.jianzhang.service;

import com.example.jianzhang.dto.record.CreateOrUpdateRecordDTO;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.service
 * @date: 2020/6/7 20:25
 **/
public interface RecordService {
    boolean createRecord(CreateOrUpdateRecordDTO recordDTO);
}
