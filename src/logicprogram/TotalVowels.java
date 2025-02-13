package logicprogram;

public class TotalVowels {
	public static void main(String[] args) {
		String s1="supriyaaieou";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char s2=s1.charAt(i);
			if(s2=='a'|s2=='e'|s2=='i'|s2=='o'|s2=='u')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
