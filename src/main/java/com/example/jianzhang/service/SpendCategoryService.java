package com.example.jianzhang.service;

import com.example.jianzhang.model.SpendCategoryDO;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.service
 * @date: 2020/6/9 20:31
 **/
public interface SpendCategoryService {
    List<SpendCategoryDO> findAll();

    List<SpendCategoryDO> getByRecordTypeId(int recordTypeId);
}
