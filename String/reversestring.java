package pack;

/*Logical Questions
	1.	Reverse String, a_b_cde_f_g
	2.	Reverse String Without Disturbing the underscore Order,  aaa_b_cde_f_g
*/

public class reversestring {
	public static void main(String args[] ){
		String str="a_b_cde_f_g";
		
		String rev="";
		for(int i = str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}
}
