package com.example.jianzhang.service.impl;

import com.example.jianzhang.dto.record.CreateOrUpdateRecordDTO;
import com.example.jianzhang.mapper.RecordMapper;
import com.example.jianzhang.model.RecordDO;
import com.example.jianzhang.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.service.impl
 * @date: 2020/6/7 20:59
 **/
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;

    @Override
    public boolean createRecord(CreateOrUpdateRecordDTO validator) {
        RecordDO recordDO = new RecordDO();
        recordDO.setType(validator.getType());
        recordDO.setSpendCategory(validator.getSpendCategory());
        recordDO.setAmount(validator.getAmount());
        recordDO.setOccurTime(validator.getOccurTime());
        recordDO.setCreateTime(new Date());
        return recordMapper.insert(recordDO) > 0;
    }
}
