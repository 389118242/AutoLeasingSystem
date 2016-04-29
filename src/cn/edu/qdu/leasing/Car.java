package cn.edu.qdu.leasing;

public class Car extends Motor {
	
	private String type;//轿车类型

	/**
	 * 初始化汽车类型，日租金
	 * @param type	汽车类型
	 * @param dailyRental	汽车日租金
	 */
	public Car(String type,double dailyRental){
		this.type=type;
		setDailyRental(dailyRental);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
