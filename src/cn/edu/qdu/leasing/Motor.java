package cn.edu.qdu.leasing;

public class Motor {
	private double dailyRental;//�����
	
	/**
	 * ���������
	 * @param leaseDays	��������
	 * @return	�����
	 */
	public double totalRental(int leaseDays) {
		
		return dailyRental * leaseDays;
	}

	public double getDailyRental() {
		return dailyRental;
	}

	public void setDailyRental(double dailyRental) {
		this.dailyRental = dailyRental;
	}
}
