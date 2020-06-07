package com.example.jianzhang.dto.record;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.dto.record
 * @date: 2020/6/7 20:28
 **/
@Data
@NoArgsConstructor
public class CreateOrUpdateRecordDTO {
    @NotNull(message = "{record.type.not-empty}")
    private Integer type;

    @NotNull(message = "{record.spendCategory.not-empty}")
    private Integer spendCategory;

    @NotNull(message = "{record.amount.not-empty}")
    private Double amount;

    private Date occurTime;
}
