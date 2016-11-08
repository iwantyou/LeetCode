package com.dynamic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
 * https://leetcode.com/problems/frog-jump/
 * 403. Frog Jump
 *  A frog is crossing a river. The river is divided into x units and at each unit there may or may not exist a stone. The frog can jump on a stone, but it must not jump into the water.

	Given a list of stones' positions (in units) in sorted ascending order, determine if the frog is able to cross the river by landing on the last stone. Initially, the frog is on the first stone and assume the first jump must be 1 unit.

	If the frog's last jump was k units, then its next jump must be either k - 1, k, or k + 1 units. Note that the frog can only jump in the forward direction.
 */
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main7 main7=new Main7();
		int[]stones={0,1,3,4,5,7,9,10,12};
		System.out.println(main7.canCross(stones));
	}
	//感觉并没有用到动态规划
	public boolean canCross(int[] stones){
		if (stones[1] != 1) {
            return false;
        }
        if (stones.length < 3) {
            return true;
        }
		Map<Integer, Set<Integer>> map=new HashMap<>();
		//set保存跳到当前下标时的跳的距离
		Set<Integer>set=new HashSet<>();
		set.add(1);
		map.put(1, set);
		for(int i=2;i<stones.length;i++){
			boolean flag=false;
			Set<Integer>newset=new HashSet<>();
			for(int j=1;j<i;j++){
				Set<Integer>tempset=map.get(j);
				int dist=stones[i]-stones[j];
				for(int step=-1;step<=1;step++){
					if(tempset.contains(dist-step)){
						newset.add(dist);
						flag=true;
					}
				}
			}
			if(flag) map.put(i, newset);
		}
		if(map.get(stones.length-1)!=null) return true;
		else return false;
	}
	//这是用回溯法，因为用到递归所以超时了
	/*public boolean can(int[]stones,int index,int k){
		if(index==stones.length-1) return true;
		for(int i=k-1;i<=k+1;i++){
			
			int nexJump=stones[index]+i;
			int nextPosition=Arrays.binarySearch(stones, index+1,stones.length , nexJump);
			
			if(nextPosition>0){
				if(can(stones, nextPosition,i )) return true;
			}
		}
		return false;
	}*/
}
