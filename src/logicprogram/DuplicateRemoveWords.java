package logicprogram;

import java.util.HashSet;

public class DuplicateRemoveWords {
	public static void main(String []args)
	{
		String s="abdcdefgsg";
		HashSet hs=new HashSet();
		for(String s1:s)
		{
			hs.add(s);
		}
		System.out.println(hs);
	}

}
