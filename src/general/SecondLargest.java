package general;
import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		int[]numbers = {12};
		TreeSet<Integer> set = new TreeSet<>();
		for(int num : numbers) {
			set.add(num);
			System.out.println(set);
		}
		if(set.size()<2) {
			System.out.println("Oops! mate if size is  less than 2 no second largest");
			
		}else {
			set.remove(set.last()); 
			
			System.out.println("The second largest number is:" +set.last());
		}
		

	}

}
