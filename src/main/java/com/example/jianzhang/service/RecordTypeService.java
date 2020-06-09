package com.example.jianzhang.service;

import com.example.jianzhang.model.RecordTypeDO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.service
 * @date: 2020/6/9 20:30
 **/
public interface RecordTypeService {
    List<RecordTypeDO> findAll();
}
