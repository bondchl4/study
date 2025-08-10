package com.ruoyi.common.core.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单主表
 */
public class Orders {
    /**
    * 订单ID
    */
    private Long orderId;

    /**
    * 订单编号
    */
    private String orderNo;

    /**
    * 用户ID
    */
    private Long userId;

    /**
    * 订单总金额
    */
    private BigDecimal totalAmount;

    /**
    * 实付金额
    */
    private BigDecimal paymentAmount;

    /**
    * 运费
    */
    private BigDecimal freightAmount;

    /**
    * 优惠金额
    */
    private BigDecimal discountAmount;

    /**
    * 支付方式(1:支付宝 2:微信 3:银行卡)
    */
    private Byte paymentType;

    /**
    * 订单状态(0:待支付 1:已支付 2:已发货 3:已完成 4:已取消 5:已退款)
    */
    private Byte status;

    /**
    * 支付时间
    */
    private Date paymentTime;

    /**
    * 发货时间
    */
    private Date deliveryTime;

    /**
    * 收货时间
    */
    private Date receiveTime;

    /**
    * 订单备注
    */
    private String remark;

    private Date createTime;

    private Date updateTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Byte getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Byte paymentType) {
        this.paymentType = paymentType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}