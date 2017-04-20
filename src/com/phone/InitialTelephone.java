package com.phone;

public class InitialTelephone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Telephone phone = new Telephone();
		phone.sendMessage();
		//给实例变量赋值
		phone.cpu = 5.0f;
		phone.mem = 1.4f;
		phone.screen = 2.0f;
		//调用对象方法
		phone.sendMessage();
		phone.call();
	}

}
