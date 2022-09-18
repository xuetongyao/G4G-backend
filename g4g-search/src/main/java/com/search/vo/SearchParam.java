package com.search.vo;

import lombok.Data;

/**
 * @Author:  tongyao
 * @Date: 2021/4/6 21:28
 * @Site:  
 * @Github: 
 */
@Data
public class SearchParam {
    private String keyword; // 全文匹配的关键字
    private String id; // 题目 id
    private Integer pageNum; // 题目 id
}
