package com.phone;

public class Telephone {
	//属性(成员变量)有什么
	float screen;
	float cpu;
	float mem;
	int var;
	//Do Do what
	void call(){
		int localVar = 0;
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		System.out.println("Telephone有打电话的功能!");
	}
	void sendMessage(){
		System.out.println("var:"+var);
		System.out.println("screen:" + screen +
				"cpu:" + cpu +
				"mem:" + mem +
				" Telephone有发短信的功能!");
	}
}
