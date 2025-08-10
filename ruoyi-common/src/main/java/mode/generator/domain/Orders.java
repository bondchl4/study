package generator.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 订单主表
* @TableName orders
*/
public class Orders implements Serializable {

    /**
    * 订单ID
    */
    @NotNull(message="[订单ID]不能为空")
    @ApiModelProperty("订单ID")
    private Long orderId;
    /**
    * 订单编号
    */
    @NotBlank(message="[订单编号]不能为空")
    @Size(max= 64,message="编码长度不能超过64")
    @ApiModelProperty("订单编号")
    @Length(max= 64,message="编码长度不能超过64")
    private String orderNo;
    /**
    * 用户ID
    */
    @NotNull(message="[用户ID]不能为空")
    @ApiModelProperty("用户ID")
    private Long userId;
    /**
    * 订单总金额
    */
    @NotNull(message="[订单总金额]不能为空")
    @ApiModelProperty("订单总金额")
    private BigDecimal totalAmount;
    /**
    * 实付金额
    */
    @NotNull(message="[实付金额]不能为空")
    @ApiModelProperty("实付金额")
    private BigDecimal paymentAmount;
    /**
    * 运费
    */
    @ApiModelProperty("运费")
    private BigDecimal freightAmount;
    /**
    * 优惠金额
    */
    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount;
    /**
    * 支付方式(1:支付宝 2:微信 3:银行卡)
    */
    @ApiModelProperty("支付方式(1:支付宝 2:微信 3:银行卡)")
    private Integer paymentType;
    /**
    * 订单状态(0:待支付 1:已支付 2:已发货 3:已完成 4:已取消 5:已退款)
    */
    @NotNull(message="[订单状态(0:待支付 1:已支付 2:已发货 3:已完成 4:已取消 5:已退款)]不能为空")
    @ApiModelProperty("订单状态(0:待支付 1:已支付 2:已发货 3:已完成 4:已取消 5:已退款)")
    private Integer status;
    /**
    * 支付时间
    */
    @ApiModelProperty("支付时间")
    private Date paymentTime;
    /**
    * 发货时间
    */
    @ApiModelProperty("发货时间")
    private Date deliveryTime;
    /**
    * 收货时间
    */
    @ApiModelProperty("收货时间")
    private Date receiveTime;
    /**
    * 订单备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("订单备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String remark;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Date createTime;
    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Date updateTime;

    /**
    * 订单ID
    */
    private void setOrderId(Long orderId){
    this.orderId = orderId;
    }

    /**
    * 订单编号
    */
    private void setOrderNo(String orderNo){
    this.orderNo = orderNo;
    }

    /**
    * 用户ID
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 订单总金额
    */
    private void setTotalAmount(BigDecimal totalAmount){
    this.totalAmount = totalAmount;
    }

    /**
    * 实付金额
    */
    private void setPaymentAmount(BigDecimal paymentAmount){
    this.paymentAmount = paymentAmount;
    }

    /**
    * 运费
    */
    private void setFreightAmount(BigDecimal freightAmount){
    this.freightAmount = freightAmount;
    }

    /**
    * 优惠金额
    */
    private void setDiscountAmount(BigDecimal discountAmount){
    this.discountAmount = discountAmount;
    }

    /**
    * 支付方式(1:支付宝 2:微信 3:银行卡)
    */
    private void setPaymentType(Integer paymentType){
    this.paymentType = paymentType;
    }

    /**
    * 订单状态(0:待支付 1:已支付 2:已发货 3:已完成 4:已取消 5:已退款)
    */
    private void setStatus(Integer status){
    this.status = status;
    }

    /**
    * 支付时间
    */
    private void setPaymentTime(Date paymentTime){
    this.paymentTime = paymentTime;
    }

    /**
    * 发货时间
    */
    private void setDeliveryTime(Date deliveryTime){
    this.deliveryTime = deliveryTime;
    }

    /**
    * 收货时间
    */
    private void setReceiveTime(Date receiveTime){
    this.receiveTime = receiveTime;
    }

    /**
    * 订单备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }

    /**
    * 
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 
    */
    private void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }


    /**
    * 订单ID
    */
    private Long getOrderId(){
    return this.orderId;
    }

    /**
    * 订单编号
    */
    private String getOrderNo(){
    return this.orderNo;
    }

    /**
    * 用户ID
    */
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 订单总金额
    */
    private BigDecimal getTotalAmount(){
    return this.totalAmount;
    }

    /**
    * 实付金额
    */
    private BigDecimal getPaymentAmount(){
    return this.paymentAmount;
    }

    /**
    * 运费
    */
    private BigDecimal getFreightAmount(){
    return this.freightAmount;
    }

    /**
    * 优惠金额
    */
    private BigDecimal getDiscountAmount(){
    return this.discountAmount;
    }

    /**
    * 支付方式(1:支付宝 2:微信 3:银行卡)
    */
    private Integer getPaymentType(){
    return this.paymentType;
    }

    /**
    * 订单状态(0:待支付 1:已支付 2:已发货 3:已完成 4:已取消 5:已退款)
    */
    private Integer getStatus(){
    return this.status;
    }

    /**
    * 支付时间
    */
    private Date getPaymentTime(){
    return this.paymentTime;
    }

    /**
    * 发货时间
    */
    private Date getDeliveryTime(){
    return this.deliveryTime;
    }

    /**
    * 收货时间
    */
    private Date getReceiveTime(){
    return this.receiveTime;
    }

    /**
    * 订单备注
    */
    private String getRemark(){
    return this.remark;
    }

    /**
    * 
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 
    */
    private Date getUpdateTime(){
    return this.updateTime;
    }

}
