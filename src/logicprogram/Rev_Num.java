package logicprogram;

public class Rev_Num {public static void main(String[] args) {
	int num=123;
	int count=0;
	for(int i=num;i>0;i=i/10)
	{
		int rem=i%10;
		count=count*10+rem;
		
	}
	System.out.println(count);
}

}
