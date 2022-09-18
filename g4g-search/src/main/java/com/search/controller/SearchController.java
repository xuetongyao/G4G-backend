package com.search.controller;

import com.search.service.IQuestionSearchService;
import com.search.vo.SearchParam;
import com.search.vo.SearchQuestionResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:  tongyao
 * @Date: 2021/4/6 21:26
 * @Site:  
 * @Github: 
 */
@RequestMapping("/search")
@RestController
public class SearchController {

    @Autowired
    IQuestionSearchService questionSearchService;

    @PostMapping("/question/list")
    public SearchQuestionResponse list(SearchParam param) {

        return questionSearchService.search(param);

    }
}
