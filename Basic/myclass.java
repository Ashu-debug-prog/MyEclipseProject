package mypack;

public class myclass {

	public static void main(String[] args) {
		int a=2;
		int b= 4;
		System.out.println("before swap a:"+a+"before swap b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a:"+a+ "after swapping b:"+b);

	}

}
