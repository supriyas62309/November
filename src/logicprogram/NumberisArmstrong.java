package logicprogram;

public class NumberisArmstrong {
	public static void main(String []args)
	{
int a=145;
int count=0;
for(int i=a;i>0;i=i/10)
{
	int rem=i%10;
	count=count+(rem*rem*rem);
	if(count==a)
	{
		System.out.println("number is Armstrong");
	}
	else
	{
		System.out.println("number is not Armstrong");
	}
}}}
