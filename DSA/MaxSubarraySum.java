package DSA;

import java.util.Scanner;

public class MaxSubarraySum {



    public static void main(String[] args) {
    	System.out.println("Sliding window program");
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size= ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements=");
        
        for (int i = 0; i < n; i++)
        {
       		arr[i] = sc.nextInt();
        }

        System.out.print("Window size: ");
        int k = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < k; i++) 
        {
        	sum = sum + arr[i];			
        }
        int max = sum;

        for (int i = k; i < n; i++) 
        {
            sum = sum + arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        System.out.println("Max sum  is " + max);
    }
    }

