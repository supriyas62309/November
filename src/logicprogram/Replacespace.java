package logicprogram;

public class Replacespace {
	public static void main(String[] args) {
		String s1="kavit and me ";
		String s2=s1.replaceAll(" ", "@");
		System.out.println(s2);
		
		String s3=s1.replaceAll(" ", "");
		System.out.println(s3);
		String s4=s1.replaceAll("[aeiou]","");
		System.out.println(s4);
	}

}
