package text001;

public class Graduate implements StudentMageInterface,TeacherManageInterface {
	private String name; //姓名  
    private String sex;//性别  
    private int age;  //年龄
    private int fee;//每学期学费  
    private int pay;//月工资  
    Graduate(String n,String s,int a){       
        this.name=n;      
        this.sex=s;    
        this.age=a;  
    }
    
    public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public static void main(String[] args){      
        Graduate g=new Graduate("zhangsan","男",18);  
        g.setFee(6000);  
        g.setPay(500);  
        if((g.getPay()*12-g.getFee())<=2000) {
        	System.out.println("Provide a loan!");
        }                  
        else       
            System.out.println("Good boy!");     
   }    
}
//学生信息管理接口  
interface StudentMageInterface {  
  public void setFee(int f); //设置学生每学期的学费  
  public int getFee(); //获取学生每学期的学费  

}  
//教师信息管理接口 
interface TeacherManageInterface {  
   public void setPay(int p);//设置教师月工资  
   public int getPay();    //获取教师月工资  

}  
