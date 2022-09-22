package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Set<Integer> numbers=new TreeSet<Integer>();
		for (Integer integer : data) {
			numbers.add(integer);
		}
		List<Integer> number_list=new ArrayList<Integer>(numbers);
		System.out.println(number_list.get(number_list.size()-2));
	}

}
