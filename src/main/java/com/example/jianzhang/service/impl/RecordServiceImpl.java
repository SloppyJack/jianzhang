package com.example.jianzhang.service.impl;

import com.example.jianzhang.common.LocalUser;
import com.example.jianzhang.dto.record.CreateOrUpdateRecordDTO;
import com.example.jianzhang.mapper.RecordMapper;
import com.example.jianzhang.model.RecordDO;
import com.example.jianzhang.model.SpendCategoryDO;
import com.example.jianzhang.model.UserDO;
import com.example.jianzhang.service.RecordService;
import io.github.talelin.autoconfigure.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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
        // 设置花费的类别
        SpendCategoryDO spendCategoryDO = new SpendCategoryDO();
        spendCategoryDO.setId(validator.getSpendCategory());
        // 设置记账人
        UserDO userDO = LocalUser.getLocalUser();
        recordDO.setUser(userDO);
        recordDO.setSpendCategory(spendCategoryDO);
        recordDO.setAmount(validator.getAmount());
        recordDO.setOccurTime(validator.getOccurTime());
        recordDO.setCreateTime(new Date());
        return recordMapper.insert(recordDO) > 0;
    }

    @Override
    public List<RecordDO> getRecordsByLocalUser() {
        UserDO userDO = LocalUser.getLocalUser();
        return recordMapper.selectByUserId(userDO.getId());
    }

    @Override
    public RecordDO getById(Long id) {
        return recordMapper.selectById(id);
    }

    @Override
    public boolean updateRecord(RecordDO recordDO, CreateOrUpdateRecordDTO validator) {
        if (validator.getSpendCategory() != null) {
            SpendCategoryDO spendCategoryDO = new SpendCategoryDO();
            spendCategoryDO.setId(validator.getSpendCategory());
            recordDO.setSpendCategory(spendCategoryDO);
        }
        recordDO.setOccurTime(validator.getOccurTime());
        recordDO.setAmount(validator.getAmount());
        recordDO.setRemarks(validator.getRemarks());
        recordDO.setUpdateTime(new Date());
        return recordMapper.updateById(recordDO) > 0;
    }
}
