package logicprogram;

public class ReverseString {
	public static void main(String []args)
	{
		String s1="my name is supriya";
		String []s2=s1.split(" ");
		String s3="";
		for(int i=0;i<=s2.length-1;i++)
		{
			String s4=s2[i];
			for(int j=s4.length()-1;j>=0;j--)
			{
				s3=s3+s4.charAt(j);
			}
			
		}
		System.out.println(s3+" ")//ethe space takli ahe tri ka nahi yete ahe output
	}
}


