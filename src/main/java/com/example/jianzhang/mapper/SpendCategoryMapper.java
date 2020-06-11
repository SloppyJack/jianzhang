package com.example.jianzhang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jianzhang.model.RecordDO;
import com.example.jianzhang.model.SpendCategoryDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.mapper
 * @date: 2020/6/9 20:29
 **/
@Repository
public interface SpendCategoryMapper extends BaseMapper<SpendCategoryDO> {
    List<SpendCategoryDO> selectByRecordTypeId(@Param("recordTypeId")int recordTypeId);
}
