package logicprogram;

public class ReverserStringWith {
	
	public static String rev(String s)
	{
		String  r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		return r;
	}
	
	public static void main(String []args)
	{
		String str=" java easy programming language so";
		String [] s=str.split(" ");
		for(int i=0;i<str.length()-1;i++)
		{
			String ar=s[i];
			if(i%2==0)
			{
			System.out.print(rev(ar)+" ");	
			}
			else
			{
				System.out.print(ar+" ");
			}
		}
	}

}
