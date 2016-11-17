package com.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 
 * @author wwh
 *347. Top K Frequent Elements   QuestionEditorial Solution  My Submissions
	Total Accepted: 39310
	Total Submissions: 86970
	Difficulty: Medium
	Contributors: Admin
	Given a non-empty array of integers, return the k most frequent elements.
	
	For example,
	Given [1,1,1,2,2,3] and k = 2, return [1,2].
	
	Note: 
	You may assume k is always valid, 1 ¡Ü k ¡Ü number of unique elements.
	Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class Main5 {
	public static void main(String[] args){
		Main5 main5=new Main5();
		int []nums={1,1,1,2,2,3};
		List<Integer>list=main5.topKFrequent(nums, 2);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	 public List<Integer> topKFrequent(int[] nums, int k) {
		 	Map<Integer, Integer> map=new HashMap<>();
		 	for(int i:nums){
		 		if(map.containsKey(i)){
		 			int count=map.get(i);
		 			map.put(i, ++count);
		 		}else{
		 			map.put(i, 1);
		 		}
		 	}
		 	List<Map.Entry<Integer, Integer>> list=sortMap(map);
		 	List<Integer>list2=new ArrayList<>();
		 	int index=0;
		 	while(index<k){
		 		list2.add(list.get(index).getKey());
		 		index++;
		 	}
		 	
		 	return list2;
	    }
	 public List<Map.Entry<Integer, Integer>> sortMap(Map map){
		 List<Map.Entry<Integer, Integer>> list=new ArrayList<>(map.entrySet());
		 Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue()-o1.getValue();
			}
		});
		
		return list;
		 
	 }
	 
}
