package logicprogram;

public class removevowels {
	public static void main(String[] args) {
		String s1="supriya";
		String str1="";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char str=s1.charAt(i);
			if(str=='a'|str=='e'|str=='i'|str=='o'|str=='u')
			{
				count++;
			}
			else
			{
				str1=str1+str;
			}
			
		}
		System.out.println(str1);
	}

}
