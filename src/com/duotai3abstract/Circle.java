package com.duotai3abstract;

public class Circle extends Shape {
	int x;
	double area;
	double perimeter;

	public void a() {
		// TODO Auto-generated method stub
		area = 3.14 * x * x;
		System.out.println("园的周长：" + area);
	}

	public void p() {
		// TODO Auto-generated method stub
		perimeter = 2 * 3.14 * x;
		System.out.println("园的面积：" + perimeter);
	}

}
