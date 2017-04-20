package com.duotai4interface;

public class SmartPhone extends Telephone implements IPlayGame {

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音打电话");
	}

	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过语音发短信");
	}

	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("具有了玩游戏的功能");
	}

}
