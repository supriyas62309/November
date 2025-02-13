package logicprogram;

import java.util.HashSet;

public class DuplicateWordsRemove {
	public static void main(String []args)
	{
		String s="abccddeeffsghd";
		char []c=s.toCharArray();
		HashSet<Character>hs=new HashSet();
		for(char a:c)
		{
			hs.add(a);
		}
		System.out.println(hs);
		
	}

}
