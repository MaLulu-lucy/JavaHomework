package bank;

import java.util.Scanner;

public class TextAccount {

	/**
	 * @param args
	 * @author malulu
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver = new DepositAccount();
		saver.setName("ZhanSan");
		saver.setAccountNumber("1234567890");
		saver.setYearRate((float) 0.023);
		float m=saver.save(2000);
		System.out.println("�˺�:"+saver.getAccountNumber());
		System.out.println("����:"+saver.getName());
		System.out.println("������:"+saver.getYearRate());
		System.out.println("����5000Ԫ");
		System.out.println("���:"+m);
		System.out.println("��ѯ���:"+saver.getBalance());
		System.out.println("����Ϣ:"+saver.yearInterest());
	}

}
class DepositAccount {
	private String accountNumber;//�˺�
	private String name;//��������
	private float balance=5000;//���
	static float yearRate;//������
	private float mmonthRate;//����Ϣ
	private float myearRate;//����Ϣ
	private float money;//���
	private float originbalance;//����+����ֵ
	public void setName(String name) {//����
		this.name=name;
	}
	public String getName() {//��ѯ��������
		return name;
	}
	public void setAccountNumber(String accountNumber) {//�˺�
		this.accountNumber=accountNumber;
	}
	public String getAccountNumber() {//��ѯ�˺�
		return accountNumber;
	}
	
	public float getYearRate() {
		return yearRate;
	}
	public void setYearRate(float yearRate) {
		this.yearRate = yearRate;
	}
	public float save(float mm) {//���
		return money=mm;
	}
	
	public float getBalance() {//��ѯ���
		originbalance=balance+money;
		return balance=(balance+money)*(1+yearRate);
	}
	public float yearInterest() {//����Ϣ
		return myearRate=originbalance*yearRate;
	}
	public float monthInterest() {//����Ϣ
		return mmonthRate=myearRate/12;
	}
	
}