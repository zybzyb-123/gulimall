package com.zhao.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhao.common.utils.PageUtils;
import com.zhao.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zhaoyibo
 * @email 1595346022@qq.com
 * @date 2021-09-17 11:19:20
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

