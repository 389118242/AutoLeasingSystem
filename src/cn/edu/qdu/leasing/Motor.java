package cn.edu.qdu.leasing;

public class Motor {
	private double dailyRental;//日租金
	
	/**
	 * 计算总租金
	 * @param leaseDays	租赁天数
	 * @return	总租金
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
