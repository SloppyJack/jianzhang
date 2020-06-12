package com.example.jianzhang.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.model
 * @date: 2020/6/7 21:00
 **/
@TableName("tb_record_detail")
@Data
public class RecordDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private SpendCategoryDO spendCategory;

    private UserDO user;

    private Double amount;

    private String remarks;

    private Date occurTime;

    @JsonIgnore
    private Date createTime;

    @JsonIgnore
    private Date updateTime;

    @JsonIgnore
    @TableLogic
    private Date deleteTime;
}
