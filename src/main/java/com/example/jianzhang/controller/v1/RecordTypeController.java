package com.example.jianzhang.controller.v1;

import com.example.jianzhang.model.RecordTypeDO;
import com.example.jianzhang.service.RecordTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.controller.v1
 * @date: 2020/6/9 20:32
 **/
@RestController
@RequestMapping("/v1/recordType")
@Validated
public class RecordTypeController {
    @Autowired
    private RecordTypeService recordTypeService;

    @GetMapping("")
    public List<RecordTypeDO> getRecordTypes() {
        List<RecordTypeDO> recordTypes = recordTypeService.findAll();
        return recordTypes;
    }
}
