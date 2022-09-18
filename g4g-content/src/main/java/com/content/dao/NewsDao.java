package com.content.dao;

import com.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-15 17:13:14
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
