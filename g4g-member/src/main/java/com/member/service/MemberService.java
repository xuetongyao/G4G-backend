package com.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author tongyao
 * @email 815146053@qq.com
 * @date 2020-04-15 17:42:00
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);


    String sendCoupon(int num) throws Exception;


    MemberEntity getMemberByUserId(String userId);
}

