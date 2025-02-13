package logicprogram;

import java.util.HashMap;
import java.util.Set;

public class countrepetchar {
	public static void main(String[] args) {
		{
	String s1="abacadac";
	HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
	for(int i=0;i<=s1.length()-1;i++)
	{
	char ch=s1.charAt(i);
	if(mp.containsKey(ch))
	{
		mp.put(ch, mp.get(ch)+1);
	}
	else
	{
		mp.put(ch, 1);
	}
	}
	Set<Character>allkeys=mp.keySet();
	for(Character r:allkeys)
	{
		System.out.println(r+" "+mp.get(r));
	}
	
		}
	}

}
