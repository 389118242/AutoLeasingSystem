package cn.edu.qdu.leasing;

public class Car extends Motor {
	
	private String type;//�γ�����

	/**
	 * ��ʼ���������ͣ������
	 * @param type	��������
	 * @param dailyRental	���������
	 */
	public Car(String type,double dailyRental,String numblePlate){
		this.type=type;
		setDailyRental(dailyRental);
		setNumblePlate(numblePlate);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
