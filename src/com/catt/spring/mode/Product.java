package com.catt.spring.mode;

import java.sql.Timestamp;

public class Product {

	public Long id;
	public String name;
	public String nutrientContent;
	public Float price;
	public Integer type; //种类,农产品有很多种类,1水果,2粮食,3茶叶,4蔬菜，5瓜果
	public Timestamp productDate;//生产时间
	public String productAddress;//产地
	public String picturePath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNutrientContent() {
		return nutrientContent;
	}

	public void setNutrientContent(String nutrientContent) {
		this.nutrientContent = nutrientContent;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Timestamp getProductDate() {
		return productDate;
	}

	public void setProductDate(Timestamp productDate) {
		this.productDate = productDate;
	}

	public String getProductAddress() {
		return productAddress;
	}

	public void setProductAddress(String productAddress) {
		this.productAddress = productAddress;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

}
