package text001;

public class Graduate implements StudentMageInterface,TeacherManageInterface {
	private String name; //����  
    private String sex;//�Ա�  
    private int age;  //����
    private int fee;//ÿѧ��ѧ��  
    private int pay;//�¹���  
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
        Graduate g=new Graduate("zhangsan","��",18);  
        g.setFee(6000);  
        g.setPay(500);  
        if((g.getPay()*12-g.getFee())<=2000) {
        	System.out.println("Provide a loan!");
        }                  
        else       
            System.out.println("Good boy!");     
   }    
}
//ѧ����Ϣ����ӿ�  
interface StudentMageInterface {  
  public void setFee(int f); //����ѧ��ÿѧ�ڵ�ѧ��  
  public int getFee(); //��ȡѧ��ÿѧ�ڵ�ѧ��  

}  
//��ʦ��Ϣ����ӿ� 
interface TeacherManageInterface {  
   public void setPay(int p);//���ý�ʦ�¹���  
   public int getPay();    //��ȡ��ʦ�¹���  

}  
