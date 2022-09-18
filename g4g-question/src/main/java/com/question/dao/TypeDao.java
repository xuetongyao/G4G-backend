package com.question.dao;

import com.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-25 22:34:04
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
