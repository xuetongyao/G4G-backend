package com.search.service;

import com.search.vo.SearchParam;
import com.search.vo.SearchQuestionResponse;

/**
 * @Author:  tongyao
 * @Date: 2021/4/6 21:31
 * @Site:  
 * @Github: 
 */
public interface IQuestionSearchService {

    SearchQuestionResponse search(SearchParam param);
}
