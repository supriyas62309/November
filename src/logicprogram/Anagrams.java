package logicprogram;

import java.util.Arrays;

public class Anagrams {
	public static void main(String []args)
	{
		String s1="madam";
		String s3="madam";
		char []ch=s1.toCharArray()	;
				char []ch2=s3.toCharArray();
	Arrays.sort(ch);
	Arrays.sort(ch2);
	System.out.println(ch);
	if(Arrays.equals(ch,ch2))
	{
		System.out.println("String is Anagrams");
	}
	else
	{
		System.out.println("String is not Anagrams");
	}
	
	
	
	}

}
