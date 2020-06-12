package com.example.jianzhang.controller.v1;

import com.example.jianzhang.dto.book.CreateOrUpdateBookDTO;
import com.example.jianzhang.dto.record.CreateOrUpdateRecordDTO;
import com.example.jianzhang.service.RecordService;
import com.example.jianzhang.vo.CreatedVO;
import io.github.talelin.core.annotation.GroupMeta;
import io.github.talelin.core.annotation.LoginRequired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.controller.v1
 * @date: 2020/6/7 20:24
 **/
@RestController
@RequestMapping("/v1/record")
@Validated
public class RecordController {
    @Autowired
    private RecordService recordService;

    /**
     *@description: 记账
     *@params: validator
     *@return: CreatedVO
     *@createTime: 2020/6/8 22:16
     *@author: edit by bin
     */
    @PostMapping("")
    @GroupMeta(permission = "记录一笔账", module = "记账", mount = true)
    @LoginRequired
    public CreatedVO createRecord(@RequestBody @Validated CreateOrUpdateRecordDTO validator) {
        recordService.createRecord(validator);
        return new CreatedVO(16);
    }
}
