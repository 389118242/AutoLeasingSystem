package cn.edu.qdu.leasing;

import java.util.Scanner;

public class MySystem {
	private int numOfCars = 3;//���޹�˾�γ�����
	private int numOfBuses = 2;//���޹�˾�ͳ�����
	private Motor[] motors = new Motor[numOfCars + numOfBuses];//�洢���޹�˾��������
	
	//��ʼ�� motors����
	{
		motors[0] = new Car("�������   ", 600,"A001");
		motors[1] = new Car("����500i   ", 500,"A002");
		motors[2] = new Car("���������", 300,"A003");
		motors[3] = new Bus("<=16��", 800,"B001");
		motors[4] = new Bus(">16��", 1500,"B002");
	}

	/**
	 * ��������
	 */
	public void autoLeasing() {
		System.out.println("\t***************************");
		System.out.println("\t*** ��ӭ������������ϵͳ   ***");
		System.out.println("\t***************************\n");
		System.out.println("���޳���:");
		System.out.println("\t1.�γ�");
		System.out.println("\t2.�ͳ�");
		System.out.print("��������Ҫ���޵ĳ��ͣ���Ӧ�ı�ţ���");
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
			System.out.println("������"+leaseDays+"��"+car.getType()+"�γ������ƺ�Ϊ"+car.getNumblePlate()+"����Ҫ֧���Ľ��Ϊ��"+totalRental);
		}else{
			Bus bus = (Bus) motors[selectCode];
			System.out.println("������"+leaseDays+"��"+bus.getSeats()+"�ͳ������ƺ�Ϊ"+bus.getNumblePlate()+"����Ҫ֧���Ľ��Ϊ��"+totalRental);
		}
	}
	
	/**
	 * ѡ�������γ�
	 * @return	��ѡ�γ���Ӧ��motors��������±�
	 */
	private int askSelectCars() {
		System.out.println("\n*********  �γ�     *********");
		System.out.println("���\t���� \t\t\t���ƺ�\t�����");
		for (int i = 0; i < numOfCars; i++) {
			Car car = (Car) motors[i];
			System.out.println(i + 1 + "\t" + car.getType() + "\t\t" + car.getNumblePlate()+"\t"+car.getDailyRental());
		}
		System.out.print("\n��������Ҫ���޵Ľγ����ͣ���Ӧ�ı�ţ���");
		Scanner input = new Scanner(System.in);
		return input.nextInt() - 1;
	}

	/**
	 * ѡ�������ͳ�
	 * @return	��ѡ�ͳ���Ӧ��motors��������±�
	 */
	private int askSelectBuses() {
		System.out.println("\n*********  �ͳ�     *********");
		System.out.println("���\t����\t���ƺ�\t�����");
		for (int i = numOfCars; i < numOfCars + numOfBuses; i++) {
			Bus bus = (Bus) motors[i];
			System.out.println(i + 1 - numOfCars + "\t" + bus.getSeats() + "\t" + bus.getNumblePlate()+"\t"+bus.getDailyRental());
		}
		System.out.print("\n��������Ҫ���޵Ŀͳ����ͣ���Ӧ�ı�ţ���");
		Scanner input = new Scanner(System.in);
		return input.nextInt() - 1 + numOfCars;
	}

	/**
	 * ѯ����������
	 * @return	����
	 */
	private int askLeaseDays() {
		System.out.print("����������������>0����");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static void main(String[] args) {
		new MySystem().autoLeasing();
	}

}
