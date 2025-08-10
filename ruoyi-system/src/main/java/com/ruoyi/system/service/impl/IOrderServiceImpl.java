package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.Orders;
import com.ruoyi.system.mapper.OrdersMapper;
import com.ruoyi.system.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IOrderServiceImpl implements IOrderService {

    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public int insert(Orders orders) {
        return ordersMapper.insert(orders);
    }

    @Override
    public Orders selectByPrimaryKey(Long orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);
    }
}
