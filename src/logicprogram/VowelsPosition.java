package logicprogram;

public class VowelsPosition {
	public static void main(String[] args) {
		String s1="love you supriyaE"//ethte E ka nahi print hot ahe
		for(int i=0;i<s1.length()-1;i++)
		{
			char s2=s1.charAt(i);
			if(s2=='a'|s2=='e'|s2=='i'|s2=='o'|s2=='u'|s2=='E')
			{
				System.out.println(s1.charAt(i)+","+i+"positon of vowel");
			}
		}
	}

}
