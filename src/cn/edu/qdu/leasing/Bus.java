package cn.edu.qdu.leasing;

public class Bus extends Motor {
	private String seats;//客车座位数

	/**
	 * 初始化客车座位数、日租金
	 * @param seats	客车座位数
	 * @param dailyRental	日租金
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
