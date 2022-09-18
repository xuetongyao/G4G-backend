package com.content.dao;

import com.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-15 17:13:14
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
