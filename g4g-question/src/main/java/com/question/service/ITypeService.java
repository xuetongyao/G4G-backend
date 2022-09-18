package com.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.question.entity.TypeEntity;

import java.util.List;
import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-25 22:34:04
 */
public interface ITypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<TypeEntity> getTypeEntityList();

    List<TypeEntity> getTypeEntityListByLock();

    List<TypeEntity> getTypeEntityListByRedisDistributedLock() throws InterruptedException;

    List<TypeEntity> getTypeEntityListByRedissonDistributedLock();
}

