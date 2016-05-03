package cn.edu.qdu.leasing;

import java.util.Scanner;

public class MySystem {
	private int numOfCars = 3;//租赁公司轿车数量
	private int numOfBuses = 2;//租赁公司客车数量
	private Motor[] motors = new Motor[numOfCars + numOfBuses];//存储租赁公司所有汽车
	
	//初始化 motors数组
	{
		motors[0] = new Car("别克商务   ", 600,"A001");
		motors[1] = new Car("宝马500i   ", 500,"A002");
		motors[2] = new Car("别克林荫大道", 300,"A003");
		motors[3] = new Bus("<=16座", 800,"B001");
		motors[4] = new Bus(">16座", 1500,"B002");
	}

	/**
	 * 租赁汽车
	 */
	public void autoLeasing() {
		System.out.println("\t***************************");
		System.out.println("\t*** 欢迎进入汽车租赁系统   ***");
		System.out.println("\t***************************\n");
		System.out.println("租赁车型:");
		System.out.println("\t1.轿车");
		System.out.println("\t2.客车");
		System.out.print("请输入您要租赁的车型（对应的编号）：");
		Scanner input = new Scanner(System.in);
		int selectCode=0;
		switch (input.nextInt()) {
		case 1:
			selectCode=askSelectCars();
			
			break;
		case 2:
			selectCode=askSelectBuses();
			break;
		}
		int leaseDays=askLeaseDays();
		double totalRental=motors[selectCode].totalRental(leaseDays);
		System.out.println("\n-------------------------------------------");
		if(selectCode<numOfCars){
			Car car = (Car) motors[selectCode];
			System.out.println("您租赁"+leaseDays+"天"+car.getType()+"轿车，车牌号为"+car.getNumblePlate()+"，需要支付的金额为："+totalRental);
		}else{
			Bus bus = (Bus) motors[selectCode];
			System.out.println("您租赁"+leaseDays+"天"+bus.getSeats()+"客车，车牌号为"+bus.getNumblePlate()+"，需要支付的金额为："+totalRental);
		}
	}
	
	/**
	 * 选择哪辆轿车
	 * @return	所选轿车对应在motors数组里的下标
	 */
	private int askSelectCars() {
		System.out.println("\n*********  轿车     *********");
		System.out.println("编号\t类型 \t\t\t车牌号\t日租金");
		for (int i = 0; i < numOfCars; i++) {
			Car car = (Car) motors[i];
			System.out.println(i + 1 + "\t" + car.getType() + "\t\t" + car.getNumblePlate()+"\t"+car.getDailyRental());
		}
		System.out.print("\n请输入您要租赁的轿车类型（相应的编号）：");
		Scanner input = new Scanner(System.in);
		return input.nextInt() - 1;
	}

	/**
	 * 选择哪辆客车
	 * @return	所选客车对应在motors数组里的下标
	 */
	private int askSelectBuses() {
		System.out.println("\n*********  客车     *********");
		System.out.println("编号\t座数\t车牌号\t日租金");
		for (int i = numOfCars; i < numOfCars + numOfBuses; i++) {
			Bus bus = (Bus) motors[i];
			System.out.println(i + 1 - numOfCars + "\t" + bus.getSeats() + "\t" + bus.getNumblePlate()+"\t"+bus.getDailyRental());
		}
		System.out.print("\n请输入您要租赁的客车类型（相应的编号）：");
		Scanner input = new Scanner(System.in);
		return input.nextInt() - 1 + numOfCars;
	}

	/**
	 * 询问租赁天数
	 * @return	天数
	 */
	private int askLeaseDays() {
		System.out.print("请输入租赁天数（>0）：");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static void main(String[] args) {
		new MySystem().autoLeasing();
	}

}
