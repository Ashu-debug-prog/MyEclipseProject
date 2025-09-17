package mypack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class quicksort {
	static void Quick(int a[],int start,int end)
	{
		int i=start;
		int j= end;
		int pivot=start;
		while(i<j) {
			while(a[i]<a[pivot])
				i++;
			while(a[j]>a[pivot])
				j--;
			if(i<j)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
		}
		if(i<end)
			Quick(a,start+1,a.length-1);
		if(start<j)
			Quick(a,start,end-1);
		
	}


	public static void main(String[] args) {
		int[]a= {3,1,4,5,9,2,6};
		System.out.println("Array has: " + Arrays.toString(a));
		Quick(a,0,a.length-1);
		System.out.println("Array has: " + Arrays.toString(a));

	}

}
