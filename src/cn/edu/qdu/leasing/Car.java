package cn.edu.qdu.leasing;

public class Car extends Motor {
	
	private String type;//�γ�����

	/**
	 * ��ʼ���������ͣ������
	 * @param type	��������
	 * @param dailyRental	���������
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
