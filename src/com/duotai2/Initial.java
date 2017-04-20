package com.duotai2;

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
	}

}
