package com.phone2;

public class Telephone {
	float screen;
	float cpu;
	float mem;
	
	public Telephone(){
		System.out.println("无参的构造方法执行了");
	}
	public Telephone(float newScreen,float newCpu,float newMem){
		if(newScreen<3.5f){
			System.out.println("您输入的参数有问题，自动赋值为3.5");
			screen = 3.5f;
		}else{
			screen = newScreen;
		}
		cpu = newCpu;
		mem = newMem;
		System.out.println("有参的构造方法执行了");
	}
}
