package com.search.service.impl;

import com.alibaba.fastjson.JSON;
import com.tongyao.common.to.es.QuestionEsModel;
import com.search.config.EsConstant;
import com.search.service.IQuestionService;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author:  tongyao
 * @Date: 2021/3/31 17:59
 * @Site:  
 * @Github: 
 */
@Service("questionService")
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    RestHighLevelClient restHighLevelClient;

    @Override
    public boolean save(QuestionEsModel questionEsModel) throws IOException {
        // 创建数据到 ES 中
        IndexRequest indexRequest = new IndexRequest(EsConstant.QUESTION_INDEX);
        indexRequest.id(questionEsModel.getId().toString());
        String s = JSON.toJSONString(questionEsModel);
        indexRequest.source(s, XContentType.JSON);
        IndexResponse response = restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);
        System.out.println(response);
        return true;
    }
}
