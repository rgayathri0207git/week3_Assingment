package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindOccurances {

	public static void main(String[] args) {

		int[] input= {2,3,5,6,3,2,1,4,2,1,6,-1,4,4,4,2};

		Map<Integer,Integer> occur=new TreeMap<Integer,Integer>();
		Integer occurance=1;
		for (Integer i : input) {
			if(occur.containsKey(i)==false) {
				occur.put(i,occurance);
			}else {
				occur.put(i, occur.get(i)+1);
			}
		}
		System.out.println(occur);

		//using getOrDefault method
		Map<Integer,Integer> occur1=new TreeMap<Integer,Integer>();
		for (Integer i : input) { 
			occur1.put(i, (occur1.getOrDefault(i, 0)+1));
		}
		System.out.println(occur1);

		//Find highest occurrence 
		Integer mostOccur=0;
		Integer mostOccurKey = null;
		for(Integer i:occur1.keySet()) {

			if(occur1.get(i)>mostOccur) {
				mostOccur=occur1.get(i);
				mostOccurKey=i;
			}
			
		}
		System.out.println(mostOccurKey+"-->"+mostOccur);

	}





}
