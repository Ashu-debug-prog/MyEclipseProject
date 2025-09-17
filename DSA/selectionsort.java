package mypack;

import java.util.Arrays;

public class selectionsort {
	static void selectionsort(int a[])
	{
		for(int i=0;i<a.length;i++) {
			int min=a[i];
			int ref=i;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					ref=j;
				}
			}
			a[ref]=a[i];
			a[i]=min;
			
		}
	}


public static void main(String[] args) {
    //int[] a = {10, 25, 5, 40, 15, 30, 20};
    int[] a={3,1,4,1,5,9,2,6};
    System.out.println("Array has:"+Arrays.toString(a));//print original
    //Bubble_Sort(a);
    selectionsort(a);
    //Insertion_Sort(a);
    //Quick_Sort(a,0,a.length-1);
    System.out.println("Array has:"+Arrays.toString(a));//print original//print sorted

}
}

