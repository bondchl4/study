package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.Orders;

public interface IOrderService {
    public int insert(Orders orders);
    public Orders selectByPrimaryKey(Long orderId);

}
