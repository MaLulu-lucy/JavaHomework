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
		System.out.println("账号:"+saver.getAccountNumber());
		System.out.println("姓名:"+saver.getName());
		System.out.println("年利率:"+saver.getYearRate());
		System.out.println("定存5000元");
		System.out.println("存款:"+m);
		System.out.println("查询余额:"+saver.getBalance());
		System.out.println("年利息:"+saver.yearInterest());
	}

}
class DepositAccount {
	private String accountNumber;//账号
	private String name;//储户姓名
	private float balance=5000;//余额
	static float yearRate;//年利率
	private float mmonthRate;//月利息
	private float myearRate;//年利息
	private float money;//存款
	private float originbalance;//定存+存款初值
	public void setName(String name) {//开户
		this.name=name;
	}
	public String getName() {//查询储户姓名
		return name;
	}
	public void setAccountNumber(String accountNumber) {//账号
		this.accountNumber=accountNumber;
	}
	public String getAccountNumber() {//查询账号
		return accountNumber;
	}
	
	public float getYearRate() {
		return yearRate;
	}
	public void setYearRate(float yearRate) {
		this.yearRate = yearRate;
	}
	public float save(float mm) {//存款
		return money=mm;
	}
	
	public float getBalance() {//查询余额
		originbalance=balance+money;
		return balance=(balance+money)*(1+yearRate);
	}
	public float yearInterest() {//年利息
		return myearRate=originbalance*yearRate;
	}
	public float monthInterest() {//月利息
		return mmonthRate=myearRate/12;
	}
	
}