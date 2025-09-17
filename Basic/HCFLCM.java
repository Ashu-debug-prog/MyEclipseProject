package logic;
import java.util.*;

public class HCFLCM{
public static int HCF(int a, int b){
	while(b!=0) {
		int temp=b;
		b=a%b;
		a=temp;
	}return a;
}
public static int LCM(int a, int b) {
	int lcm=a*b/HCF(a,b);
	return lcm;
}


public static void main(String[]args) 
{
 System.out.println(HCF(12,18));
 System.out.println(LCM(12,18));
	

}
}