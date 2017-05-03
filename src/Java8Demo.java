
public class Java8Demo {

	public static void main(String[] args) {
		Java8Demo java8=new Java8Demo();
		
		Operator sum=(a,b)-> a+b;
		Operator sub=(int a,int b)-> a-b;
		Operator div=(a,b)-> {return a/b;};
		
		System.out.println(java8.operate(2,3,sum));
		
		
	}
	
	public int operate(int a,int b,Operator o){
		return o.operation(a, b);
	}
}

interface Operator{
	public int operation(int a ,int b);
}
