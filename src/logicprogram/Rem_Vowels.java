package logicprogram;

public class Rem_Vowels {
	public static void main(String[] args) {
		String str = "supriya";
		String str1 = "";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++)

		{
			char s1 = str.charAt(i);
			if (s1 == 'a' | s1 == 'e' | s1 == 'i' | s1 == 'o' | s1 == 'u') {
				count++;
			} else {

				str1 = str1 + s1;

			}
		}
		System.out.println(str1);

	}

}
