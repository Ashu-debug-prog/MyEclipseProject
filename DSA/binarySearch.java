package search;

public class binarySearch {
	static int binary_search(int a[],int start,int end,int key) {
		if(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==key) {
				return mid;
			}else {
				if(key<a[mid]) {
					return binary_search(a, start,mid-1,  key);
				}else
					return binary_search(a, mid+1, end, key);
		}
		}else
			return-1;
	}
	public static void main(String[]args) {
		int []	num= {10,20,30,40,50,60};
		int keyfind=40;
		int res=binary_search(num,0,num.length-1, keyfind);
		if(res!=-1) {
			System.out.println("Array found at index"+res);
		}
		else {
			System.out.println("Array not found" );
		}

}
}
