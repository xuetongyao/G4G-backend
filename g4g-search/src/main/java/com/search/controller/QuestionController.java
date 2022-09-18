package com.search.controller;

import com.tongyao.common.exception.BizCodeEnum;
import com.tongyao.common.to.es.QuestionEsModel;
import com.tongyao.common.utils.R;
import com.search.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:  tongyao
 * @Date: 2021/3/31 17:49
 * @Site:  
 * @Github: 
 */

@RequestMapping("/search")
@RestController
public class QuestionController {

    @Autowired
    IQuestionService questionService;

    // 保存题目到 ES。
    @PostMapping("/question/save")
    public R saveQuestion(@RequestBody QuestionEsModel questionEsModel) {
        boolean result =false;
        try {
            result = questionService.save(questionEsModel);
        } catch (Exception e) {
            result =false;
        }

        if (!result) {
            return R.error(BizCodeEnum.QUESTION_SAVE_EXCEPTION.getCode(), BizCodeEnum.QUESTION_SAVE_EXCEPTION.getMsg());
        }

        return R.ok();
    }
}
