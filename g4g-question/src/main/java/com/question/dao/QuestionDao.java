package com.question.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 
 * 
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-25 22:34:04
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
    IPage<QuestionEntity> selectPage1(IPage<QuestionEntity> page, Map<String, Object> params);
}
