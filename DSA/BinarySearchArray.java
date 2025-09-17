package DSA1;
//Q2. Accept 5 number in an array and sort it. Accept a number from user and check if it is there in an
//array or not, please use binary search.

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

       
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

       
        int low = 0, high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println(key + " is present in the array.");
        } else {
            System.out.println(key + " is NOT present in the array.");
        }
    }
}
