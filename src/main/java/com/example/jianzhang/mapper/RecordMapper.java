package com.example.jianzhang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jianzhang.model.RecordDO;
import org.springframework.stereotype.Repository;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.mapper
 * @date: 2020/6/7 21:02
 **/
@Repository
public interface RecordMapper extends BaseMapper<RecordDO> {
    @Override
    int insert(RecordDO entity);
}
