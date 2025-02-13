package inheritance;

public class Son extends Father{
	
	
	
	public void mobile()
	{
		System.out.println("apple");
		}

	public static void main(String []args)
	{
		Son s1=new Son();
		s1.mobile();
		s1.car();
		s1.Money();
		s1.Home();
	}
}
