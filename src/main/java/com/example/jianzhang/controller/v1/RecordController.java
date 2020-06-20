package com.example.jianzhang.controller.v1;

import com.example.jianzhang.common.LocalUser;
import com.example.jianzhang.dto.book.CreateOrUpdateBookDTO;
import com.example.jianzhang.dto.record.CreateOrUpdateRecordDTO;
import com.example.jianzhang.model.RecordDO;
import com.example.jianzhang.model.UserDO;
import com.example.jianzhang.service.RecordService;
import com.example.jianzhang.vo.CreatedVO;
import com.example.jianzhang.vo.DeletedVO;
import com.example.jianzhang.vo.UpdatedVO;
import io.github.talelin.autoconfigure.exception.ForbiddenException;
import io.github.talelin.autoconfigure.exception.NotFoundException;
import io.github.talelin.core.annotation.GroupMeta;
import io.github.talelin.core.annotation.LoginRequired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.List;

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
    @LoginRequired
    public CreatedVO createRecord(@RequestBody @Validated CreateOrUpdateRecordDTO validator) {
        recordService.createRecord(validator);
        return new CreatedVO(16);
    }

    @GetMapping("/list")
    @LoginRequired
    public List<RecordDO> getRecords() {
        return recordService.getRecordsByLocalUser();
    }

    @PutMapping("/{id}")
    public UpdatedVO updateRecord(@PathVariable("id") @Positive(message = "{id}") Long id, @RequestBody @Validated CreateOrUpdateRecordDTO validator) {
        RecordDO recordDO = recordService.getById(id);
        if (recordDO == null) {
            throw new NotFoundException("record not found", 10022);
        }
        recordService.updateRecord(recordDO, validator);
        return new UpdatedVO(17);
    }

    @DeleteMapping("/{id}")
    @LoginRequired
    public DeletedVO deleteBook(@PathVariable("id") @Positive(message = "{id}") Long id) {
        RecordDO recordDO = recordService.getById(id);
        if (recordDO == null) {
            throw new NotFoundException("record not found", 10022);
        }
        // 校验是否为当前登录人的记账记录
        UserDO userDO = LocalUser.getLocalUser();
        if (!recordDO.getUser().getId().equals(userDO.getId())) {
            throw new ForbiddenException("do not delete non personal record",10070);
        }
        recordService.deleteById(recordDO.getId());
        return new DeletedVO(18);
    }
}
