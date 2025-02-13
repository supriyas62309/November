package logicprogram;

public class uppercase {
	
	
	public static void main(String[] args)
	{
		String s1="velocity";
		char[] ch=s1.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			char ch1=s1.charAt(i);
			ch[i]=Character.toUpperCase(ch[i]);
			System.out.print(ch[i]);
		}
		
	}

}
