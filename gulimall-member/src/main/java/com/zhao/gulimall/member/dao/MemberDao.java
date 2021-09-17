package com.zhao.gulimall.member.dao;

import com.zhao.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhaoyibo
 * @email 1595346022@qq.com
 * @date 2021-09-17 11:19:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
