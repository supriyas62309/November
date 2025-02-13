package logicprogram;

import java.util.Arrays;

public class Lowest_highestNum {
	public static void main(String[] args) {
		int ar[]= {0,56,89,45,56,78,45,95};
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(ar.length-2);
		System.out.println("Smallest num"+ar[0]);
		System.out.println("largest num"+ar[ar.length-1]);
		System.out.println("Second largest num"+ar[ar.length-2]);
		
	}


}
