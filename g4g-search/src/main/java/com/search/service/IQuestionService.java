package com.search.service;

import com.tongyao.common.to.es.QuestionEsModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author:  tongyao
 * @Date: 2021/3/31 17:56
 * @Site:  
 * @Github: 
 */
@Mapper
@Component
public interface IQuestionService {
    boolean save(QuestionEsModel questionEsModel) throws IOException;
}
