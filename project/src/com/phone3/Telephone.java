package com.phone3;

public class Telephone {
	private float screen;
	private float cpu;
	private float mem;
	
	//获取screen   Get
	public float getScreen(){
		return screen;
	}
	
	//修改screen   set
	public void setScreen(float newScreen){
		screen = newScreen;
	}
	
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
