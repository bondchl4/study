package com.ruoyi.system.mapper;


import com.ruoyi.common.core.domain.entity.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}