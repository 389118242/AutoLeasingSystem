package cn.edu.qdu.leasing;

public class Bus extends Motor {
	private String seats;//�ͳ���λ��

	/**
	 * ��ʼ���ͳ���λ���������
	 * @param seats	�ͳ���λ��
	 * @param dailyRental	�����
	 */
	public Bus(String seats,double dailyRental,String numblePlate){
		this.seats=seats;
		setDailyRental(dailyRental);
		setNumblePlate(numblePlate);
	}
	
	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}
	
}
