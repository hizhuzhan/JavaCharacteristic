package com.phone3;

public class InitialTelephone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//通过无参的构造方可以创建对象
		Telephone phone = new Telephone();
		//通过有参的构造方法也可以创建对象，并给对象中的实例变量赋初值
		Telephone phone2 = new Telephone(1.5f,1.4f,2.0f);
		
		phone.setScreen(6.0f);
		System.out.println("screen:" + phone.getScreen());

	}

}
