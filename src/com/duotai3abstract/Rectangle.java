package com.duotai3abstract;

public class Rectangle extends Shape {
	int x;
	int y;
	double area;
	double perimeter;

	public void a() {
		// TODO Auto-generated method stub
		area = x * y;
		System.out.println("长方形的面积：" + area);
	}

	public void p() {
		// TODO Auto-generated method stub
		perimeter = (x + y)*2;
		System.out.println("长方形的周长：" + perimeter);
	}

}
