package com.transportationduotaitest;

public class Transportation {
	public Transportation(){
		name = "交通工具";
		type = "某种情况下";
		seat = 40;
	}
	public String name;
	public String type;
	public int seat;
	public void can(){
		System.out.println(name +
				"可以在" +
				type +
				"载" +
				seat +
				"人");
	}
}
