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
 * @date: 2020/6/9 20:26
 **/
@TableName("tb_record_category")
@Data
public class SpendCategory {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String code;

    private String name;

    // 外键，与tb_record_type表的主键关联
    private Integer recordType;

    private Integer orderNo;

    private String remarks;

    @JsonIgnore
    private Date createTime;

    @JsonIgnore
    private Date updateTime;

    @JsonIgnore
    @TableLogic
    private Date deleteTime;
}
