package com.transportationduotaitest;

public class Initial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
		bus.name = "客车";
		bus.type = "陆地";
		bus.seat = 50;
		bus.can();
		Ship ship = new Ship();
		ship.name = "轮船";
		ship.type = "海面";
		ship.seat = 200;
		ship.can();
		Plane plane = new Plane();
		plane.name = "飞机";
		plane.type = "空中";
		plane.seat = 500;
		plane.can();
	}

}
