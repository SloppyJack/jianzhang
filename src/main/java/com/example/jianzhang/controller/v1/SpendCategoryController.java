package com.example.jianzhang.controller.v1;

import com.example.jianzhang.model.SpendCategoryDO;
import com.example.jianzhang.service.SpendCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.controller.v1
 * @date: 2020/6/10 21:19
 **/
@Controller
@RequestMapping("/v1/spendCategory")
@Validated
public class SpendCategoryController {
    @Autowired
    private SpendCategoryService spendCategoryService;

    @GetMapping("")
    public List<SpendCategoryDO> getSpendCategoryList() {
        return spendCategoryService.findAll();
    }
}
