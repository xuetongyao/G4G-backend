package com.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-15 17:13:14
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

