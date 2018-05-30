package com.example.retalhelper;

public class House {

	private float area;
	private String type;
	private int price;
	private String owner;
	private String address;

	public House(float area, String type, int price, String owner, String address) {
		this.area = area;
		this.type = type;
		this.price = price;
		this.owner = owner;
		this.address = address;
	}

	public String getString() {
		return area + "坪 - " + type + " - 每月" + price + "元 - 屋主:" + owner + " - 地址:" + address;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
