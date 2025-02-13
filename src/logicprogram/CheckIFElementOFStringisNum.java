package logicprogram;

public class CheckIFElementOFStringisNum {
	public static void main(String []args)
	{
		String s1="abc1@ 1234";
		for(int i=0;i<=s1.length()-1;i++)
		{
			
		char s2=s1.charAt(i);
		if(Character.isLetter(s2))
		{
			System.out.println(s2+"letter");
		}
		else if(Character.isDigit(s2))
		{
			System.out.println(s2+"Digit");
		}
		else if(Character.isWhitespace(s2))
			
		{
			System.out.println(s2+"whitespace");
		}
		else
		{
			System.out.println(s2+" special character");
		}
		}
	}

}
