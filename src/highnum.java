import java.util.Arrays;

public class highnum {
	public static void main(String[] args) {
		int ar[]= {54,89,75,45,26,59};
		//Arrays.sort(ar);
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println(ar[i]);
		}
		
	}

}
