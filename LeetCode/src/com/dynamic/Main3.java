package com.dynamic;

import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.POAHelper;

/*
 * 121. Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.

	If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3 main3=new Main3();
		int[] prices={2,4,1,7};
		System.out.println(main3.maxProfit(prices));
	}
	public int maxProfit(int[] prices){
		int len=prices.length;
		if(len==1) return 0;
		int min=prices[0];
		int max=0;
		for(int i=1;i<len;i++){
			if(prices[i]-min>max) max=prices[i]-min;
			if(min>prices[i]) min=prices[i];
			
		}
		return max;
	}
}
