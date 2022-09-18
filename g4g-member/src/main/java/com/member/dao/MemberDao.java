package com.member.dao;

import com.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author tongyao
 * @site  
 * @date 2020-04-15 17:42:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

    MemberEntity getMemberByUserId(String userId);
}
