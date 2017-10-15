package Stu;

public class stud {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student("����", 0, "����");
		std.show();
		Student und = new Undergraduate(std.getName(),std.getAge(),std.getEducation(),"�������");
		und.show();
		Student grd = new Graduate(std.getName(),std.getAge(),std.getEducation(),"������");
		grd.show();
	}
}
class Student{
	String name;
	int age;
	String education;
	public Student(String name,int age,String education){
		this.name=name;
		this.age=age;
		this.education=education;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEducation() {
		return education;
	}

	public void show() {
		System.out.println(String.format("����:%s\t����:%s\tѧ��:%s",name,age,education));
	}
}
class Undergraduate extends Student{//��������
	String specialty;//רҵ
	public Undergraduate(String name,int age,String education,String specialty) {
		super(name,age,education);
		this.specialty=specialty;
		
	}
	
	public String getSpecialty() {
		return specialty;
	}

	public void show() {
		System.out.println(String.format("����:%s\t����:%s\tѧ��:%s\tרҵ:%s",super.getName(),super.getAge(),super.getEducation(),specialty));
	}
}
class Graduate extends Student{//�о�����
	String direction;//����
	public Graduate(String name,int age,String education,String direction) {
		super(name,age,education);
		this.direction=direction;
	}
	public void show() {
		System.out.println(String.format("����:%s\t����:%s\tѧ��:%s\t����%s",super.getName(),super.getAge(),super.getEducation(),direction));
	}
}

