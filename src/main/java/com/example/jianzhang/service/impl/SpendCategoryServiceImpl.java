package com.example.jianzhang.service.impl;

import com.example.jianzhang.mapper.SpendCategoryMapper;
import com.example.jianzhang.model.SpendCategoryDO;
import com.example.jianzhang.service.SpendCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.service.impl
 * @date: 2020/6/9 20:31
 **/
@Service
public class SpendCategoryServiceImpl implements SpendCategoryService {
    @Autowired
    private SpendCategoryMapper spendCategoryMapper;

    @Override
    public List<SpendCategoryDO> findAll() {
        return spendCategoryMapper.selectList(null);
    }
}
