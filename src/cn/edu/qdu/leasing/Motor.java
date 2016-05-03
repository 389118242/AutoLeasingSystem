package cn.edu.qdu.leasing;

public class Motor {
	private double dailyRental;// �����
	private String numblePlate;// ���ƺ�

	public Motor(double dailyRental, String numblePlate) {
		this.dailyRental = dailyRental;
		this.numblePlate = numblePlate;
	}

	/**
	 * ���������
	 * 
	 * @param leaseDays
	 *            ��������
	 * @return �����
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

	public String getNumblePlate() {
		return numblePlate;
	}

	public void setNumblePlate(String numblePlate) {
		this.numblePlate = numblePlate;
	}

}
