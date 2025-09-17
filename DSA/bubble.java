package mypack;

import java.util.Arrays;

public class bubble {
	static void bubbesort(int a[]){
		for(int i=a.length-1;i>0;i--)
			
		{
			boolean done=true;
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1])
				{
					done=false;
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
			if(done)
				break;
		}
	}

	public static void main(String[] args) {
		int[] a={3,1,4,1,5,9,2,6};
		System.out.println("Array has:"+Arrays.toString(a));
		bubbesort(a);
		System.out.println("Array has:"+Arrays.toString(a));

		
	}

}
