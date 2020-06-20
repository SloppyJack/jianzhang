package com.example.jianzhang.service;

import com.example.jianzhang.dto.record.CreateOrUpdateRecordDTO;
import com.example.jianzhang.model.RecordDO;

import java.util.List;

/**
 * @author: create by bin
 * @version: v1.0
 * @description: com.example.jianzhang.service
 * @date: 2020/6/7 20:25
 **/
public interface RecordService {
    boolean createRecord(CreateOrUpdateRecordDTO recordDTO);

    /**
     *@description: 获取当前登录用户的记账记录
     *@params:
     *@return:
     *@createTime: 2020/6/12 23:31
     *@author: edit by bin
     */
    List<RecordDO> getRecordsByLocalUser();

    /**
     *@description: 通过Id获取记账记录
     *@params:
     *@return:
     *@createTime: 2020/6/16 21:40
     *@author: edit by bin
     */
    RecordDO getById(Long id);

    /**
     *@description: 更新
     *@params:
     *@return:
     *@createTime: 2020/6/16 21:50
     *@author: edit by bin
     */
    boolean updateRecord(RecordDO recordDO,CreateOrUpdateRecordDTO validator);

    /**
     *@description: 通过Id删除某条记账记录
     *@params:
     *@return:
     *@createTime: 2020/6/20 19:07
     *@author: edit by bin
     */
    boolean deleteById(Long id);
}
