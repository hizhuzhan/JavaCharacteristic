package com.femgzhuang;

public class Telephone {
	private float screen;
	private float cpu;
	private float mem;
	
	public void sendMessage(){
		System.out.println();
	}
	
	public float getScreen() {
		return screen;
	}
	public void setScreen(float screen) {
		this.screen = screen;
	}
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getMem() {
		return mem;
	}
	public void setMem(float mem) {
		this.mem = mem;
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
