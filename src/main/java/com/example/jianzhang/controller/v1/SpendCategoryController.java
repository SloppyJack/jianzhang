package com.example.jianzhang.controller.v1;

import com.example.jianzhang.model.SpendCategoryDO;
import com.example.jianzhang.service.SpendCategoryService;
import io.github.talelin.autoconfigure.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Positive;
import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.controller.v1
 * @date: 2020/6/10 21:19
 **/
@RestController
@RequestMapping("/v1/spendCategory")
@Validated
public class SpendCategoryController {
    @Autowired
    private SpendCategoryService spendCategoryService;

    @GetMapping("")
    public List<SpendCategoryDO> getSpendCategoryList() {
        return spendCategoryService.findAll();
    }

    @GetMapping("/{recordTypeId}")
    public List<SpendCategoryDO> getBook(@PathVariable(value = "recordTypeId") @Positive(message = "{recordTypeId}") int id) {
        List<SpendCategoryDO> list = spendCategoryService.getByRecordTypeId(id);
        if (list == null) {
            throw new NotFoundException("spendCategory not found", 10022);
        }
        return list;
    }
}
