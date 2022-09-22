package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] company= {"HCL", "Wipro",  "Aspire Systems", "CTS"};

		// get the length of the array	
		System.out.println(company.length);

		//sort the array
		List<String> company_list=new ArrayList<String>();
		for(String s:company) {
			company_list.add(s);
		}
		Collections.sort(company_list);

		// Iterate it in the reverse order
		Collections.reverse(company_list);
		for(String s:company_list) {
			System.out.println(s);
		}
	}

}
