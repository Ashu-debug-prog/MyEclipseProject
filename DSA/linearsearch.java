package search;

public class linearsearch {
	public static int sequential_search(int a[],int key) {
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i]) {
				return i;
			}
		}return -1;
	}
	 public static void main(String[] args) {
		 int [] numbers= {10,20,30,40,50,60};
		 int keyfind=50;
		 int res=sequential_search(numbers, keyfind);
		 if(res!=-1) {
			 System.out.println("Key"+keyfind+"Found at index"+res);
			 
	 
		 }else {
			 System.out.println("Not found");
		 }
	 }
}
