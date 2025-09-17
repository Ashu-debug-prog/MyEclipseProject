package pack;

public class findTwoLargest {
	public static void main(String[]args) {
		int []arr= {10,5,20,8,20,30};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second && num!=first) {
				second=num;
			}
		}
		System.out.println("Highest: "+ first);
		System.out.println("Second Higest: "+ second);
	}

}