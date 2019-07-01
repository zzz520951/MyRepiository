package com.zzz.springmvc.bean;

import java.util.Date;

public class Item {
	// ��Ʒid
	private int id;
	// ��Ʒ����
	private String name;
	// ��Ʒ�۸�
	private double price;
	// ��Ʒ����ʱ��
	private Date createtime;
	// ��Ʒ����
	private String detail;

	public Item() {

	}

	public Item(int id, String name, double price, Date createtime, String detail) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.createtime = createtime;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", createtime=" + createtime + ", detail="
				+ detail + "]";
	}

	
}
