package com.example.jianzhang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jianzhang.model.RecordDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     *@description: 获取某个用户的记账记录
     *@params:
     *@return:
     *@createTime: 2020/6/12 23:32
     *@author: edit by bin
     */
    List<RecordDO> getRecordsByUserId(@Param("id") Long id);
}
