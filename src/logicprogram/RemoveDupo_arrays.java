package logicprogram;

public class RemoveDupo_arrays {
	public static void main(String[] args) {
		int ar[]= {50,26,78,56,56};
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("duplicate no"+ar[j]);
				}
			}
		}
	}

}
