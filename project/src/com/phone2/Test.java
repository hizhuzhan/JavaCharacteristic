package com.phone2;

public class Test {
	String name = "朱";		//非静态变量
	static String hobby = "zhu";		//静态变量
	
	//在静态方法种调用静态变量
	public static void print(){
		//System.out.println("name:" + name);	不可直接调用非静态变量
		
		Test realname = new Test();		//创建类对象
		System.out.println("name:" + realname.name);	//要想访问必须创建类对象
		System.out.println("hobby:" + hobby);	//可以直接调用静态变量
	
	}
	
	public void show(){
		System.out.println("My name is Zhuzhan");
	}
	
	public static void main(String[] args){
		//show();	不可直接调用类方法
		Test showName = new Test();
		showName.show();	//必须通过对象来调用
		print();	//可以直接调用静态方法
	}
}
