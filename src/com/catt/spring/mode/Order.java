package com.catt.spring.mode;

import java.sql.Timestamp;

public class Order {

	public Long userId;
	public Long userUuid;
	public Long orderId;
	public Double count;
	public Timestamp orderTime;
	public Long orderDetailId;
	public String orderName;
	public Long orderOwner;
	public int isSaled; //0发货中,1待发货,2取消订单,3确认订单
	public Integer discountRate;//折扣率，如果没有折扣为100，九折为90.

	public Long getOrderOwner() {
		return orderOwner;
	}

	public void setOrderOwner(Long orderOwner) {
		this.orderOwner = orderOwner;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getCount() {
		return count;
	}

	public void setCount(Double count) {
		this.count = count;
	}

	public Timestamp getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Long getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getIsSaled() {
		return isSaled;
	}

	public void setIsSaled(int isSaled) {
		this.isSaled = isSaled;
	}

	public Integer getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Integer discountRate) {
		this.discountRate = discountRate;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

}
