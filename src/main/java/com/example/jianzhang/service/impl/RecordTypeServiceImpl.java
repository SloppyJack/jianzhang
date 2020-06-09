package com.example.jianzhang.service.impl;

import com.example.jianzhang.mapper.RecordTypeMapper;
import com.example.jianzhang.model.RecordTypeDO;
import com.example.jianzhang.service.RecordTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.service.impl
 * @date: 2020/6/9 20:30
 **/
@Service
public class RecordTypeServiceImpl implements RecordTypeService {
    @Autowired
    private RecordTypeMapper recordTypeMapper;

    public List<RecordTypeDO> findAll() {
        return recordTypeMapper.selectList(null);
    }
}
