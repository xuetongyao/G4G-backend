package com.question.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author  tongyao
 * @email 815146053@qq.com
 * @date 2020-04-25 22:34:04
 */
public interface IQuestionService extends IService<QuestionEntity> {

    IPage<QuestionEntity> queryPage1(IPage<QuestionEntity> page, Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params);

    QuestionEntity info(Long id);

    boolean saveQuestion(QuestionEntity question);

    boolean updateQuestion(QuestionEntity question);

    boolean createQuestion(QuestionEntity question);
}

