package mypack;

import java.util.Arrays;

public class insertion {
	static void Insertionsort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int newele=a[i+1];
			int j=i+1;
			while(j>0&&a[j-1]>newele)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=newele;
		}
	}

	
		 public static void main(String[] args) {
		        int[] a = {10, 25, 5, 40, 15, 30, 20};
		        //int[] a={3,1,4,1,5,9,2,6};
		        System.out.println("Array has:"+Arrays.toString(a));//print original
		        //Bubble_Sort(a);
		        //Selection_Sort(a);
		        Insertionsort(a);
		        //Quick_Sort(a,0,a.length-1);
		        System.out.println("Array has:"+Arrays.toString(a));//print original//print sorted

		    }
		


	}


