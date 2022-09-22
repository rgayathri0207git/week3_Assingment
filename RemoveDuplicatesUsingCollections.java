package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {

		String s="We learn java basics as part of java sessions in java week1";
		removeDuplicates(s);

	}


	public static void removeDuplicates(String s) {

		String[] split = s.split("\\s+");

		Set<String> unique=new LinkedHashSet<String>();
		Set<String> duplicates=new LinkedHashSet<String>();

		for (String string : split) {
			if(unique.add(string)==false) {
				duplicates.add(string);
			}
		}
		//print only unique words
		for(String str:unique) {
			System.out.print(str+" ");
		}
		//print duplicates
		System.out.println("");
		System.out.println("Duplicates words are below:");
		for(String str:duplicates) {
			System.out.println(str);
		}
	}

}
