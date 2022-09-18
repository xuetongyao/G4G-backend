package com.question.feign;

import com.common.to.es.QuestionEsModel;
import com.common.utils.R;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author:  tongyao
 * @Date: 2021/4/6 15:14
 * @Site:  
 * @Github: 
 */
@Mapper
@FeignClient("passjava-search")
public interface SearchFeignService {

    @PostMapping("search/question/save")
    R saveQuestion(@RequestBody QuestionEsModel questionEsModel);
}
