package Stu;

public class stud {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student("张三", 0, "本科");
		std.show();
		Student und = new Undergraduate(std.getName(),std.getAge(),std.getEducation(),"软件工程");
		und.show();
		Student grd = new Graduate(std.getName(),std.getAge(),std.getEducation(),"大数据");
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
		System.out.println(String.format("姓名:%s\t年龄:%s\t学历:%s",name,age,education));
	}
}
class Undergraduate extends Student{//本科生类
	String specialty;//专业
	public Undergraduate(String name,int age,String education,String specialty) {
		super(name,age,education);
		this.specialty=specialty;
		
	}
	
	public String getSpecialty() {
		return specialty;
	}

	public void show() {
		System.out.println(String.format("姓名:%s\t年龄:%s\t学历:%s\t专业:%s",super.getName(),super.getAge(),super.getEducation(),specialty));
	}
}
class Graduate extends Student{//研究生类
	String direction;//方向
	public Graduate(String name,int age,String education,String direction) {
		super(name,age,education);
		this.direction=direction;
	}
	public void show() {
		System.out.println(String.format("姓名:%s\t年龄:%s\t学历:%s\t方向%s",super.getName(),super.getAge(),super.getEducation(),direction));
	}
}

