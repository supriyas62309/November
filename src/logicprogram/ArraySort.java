package logicprogram;

import java.util.Arrays;

public class ArraySort {
	public static void main(String []args)
	{
		int ar[]=new int[4];
		ar[0]=56;
		ar[1]=86;
		ar[2]=45;
		ar[3]=67;
		Arrays.sort(ar);
		System.out.println("==============================");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
