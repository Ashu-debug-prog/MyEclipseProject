package logic;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class uniquearray {

	public static void main(String[] args) {
		int []arr= {1,2,2,3,55,7,89};
		Set<Integer>set=new LinkedHashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println("Unique Elements:"+set);

	}

}
