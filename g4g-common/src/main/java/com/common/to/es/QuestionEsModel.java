package com.common.to.es;

import lombok.Data;

/**
 * @Author:  tongyao
 * @Date: 2021/3/31 15:16
 * @Site:  
 * @Github: 
 */

/*
"properties": {
    "id": {
        "type": "long"
    }
    "title": {
        "type": "keyword",
        "analyzer": "ik_smart"
    },
    "answer": : {
        "type": "keyword",
        "analyzer": "ik_smart"
	},
	"typeName": {
        "type": "keyword",
    },
}
* */
@Data
public class QuestionEsModel {
    private Long id;
    private String title;
    private String answer;
    private String typeName;
}
