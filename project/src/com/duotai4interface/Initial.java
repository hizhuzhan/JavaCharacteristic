package com.duotai4interface;

public class Initial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tel1 = new CellPhone();
		tel1.call();
		tel1.message();
		Telephone tel2 = new SmartPhone();
		tel2.call();
		tel2.message();
		
		IPlayGame ip1 = new SmartPhone();
		ip1.playGame();
		IPlayGame ip2 = new Psp();
		ip2.playGame();
		
		//匿名内部类----方法一
		IPlayGame ip3 = new IPlayGame(){

			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式实现接口");
			}
			
		};
		ip3.playGame();
		
		//匿名内部类----方法二
		new IPlayGame(){

			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式实现接口2");
			}
			
		}.playGame();
	}

}
