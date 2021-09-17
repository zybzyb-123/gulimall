package com.zhao.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhao.common.utils.PageUtils;
import com.zhao.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhaoyibo
 * @email 1595346022@qq.com
 * @date 2021-09-17 10:55:44
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

