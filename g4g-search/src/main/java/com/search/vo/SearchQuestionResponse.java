package com.search.vo;

import com.tongyao.common.to.es.QuestionEsModel;
import lombok.Data;

import java.util.List;

/**
 * @Author:  tongyao
 * @Date: 2021/4/7 16:50
 * @Site:  
 * @Github: 
 */
@Data
public class SearchQuestionResponse {
    private List<QuestionEsModel> questionList;
    private Integer pageNum;
    private Long total;
    private Integer totalPages;
}
