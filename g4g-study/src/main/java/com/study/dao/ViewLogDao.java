package com.study.dao;

import com.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-15 17:50:49
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
