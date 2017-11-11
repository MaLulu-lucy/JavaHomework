package text001;

public class Car {
	ComputeWeight[] goods;  
    double totalWeight=0;  
    Car (ComputeWeight[] goods)  
    {  
    this.goods=goods;  
    }  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        ComputeWeight[] goods=new ComputeWeight[3];  
        goods[0]=new Television(200); //��ת�Ͷ���  
        goods[1]=new Computer(400);  
        goods[2]=new WashMachine(500);  
        Car car=new Car(goods);  
        double totalweight;  
        totalweight=goods[0].computeWeight()+goods[1].computeWeight()+goods[2].computeWeight();  
        System.out.println("��װ�صĻ����������Ϊ:"+totalweight);  
  
    }  
}
interface ComputeWeight {  
    public double computeWeight();   
  
}  

class Computer implements ComputeWeight {  
    double cweight;  
    Computer(double c){  
        this.cweight=c;  
    }  
    public double computeWeight(){  
        return cweight;  
  
    }  
}  
class Television implements ComputeWeight { //ͨ��ʵ�ֽӿ�ComputerWeight��������  
    double tweight;  
    Television(double t){  
        this.tweight=t;  
    }  
    public double computeWeight(){  
        return tweight;  
  
    }  
}  
class WashMachine implements ComputeWeight{  
    double wweight;  
    WashMachine(double w){  
        this.wweight=w;  
    }  
    public double computeWeight(){  
        return wweight;  
  
    }  
}  