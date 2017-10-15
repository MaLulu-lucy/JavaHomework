import java.util.*;
public class digui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		n=s.nextInt();
		DiZeng a=new DiZeng();
		a.dieng(n);
	}
}
class DiZeng{
	public void dieng(int n) {
		System.out.println(n);  
        if (n <= 5000) 
        	dieng(n*2);  
        System.out.println(n);  
        }  
}