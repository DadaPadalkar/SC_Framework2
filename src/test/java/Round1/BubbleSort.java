package Round1;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,7,4,3,9,9,7,8};
		
		for(int i=0;i<a.length;i++)//for no.of passes...
		{
			for(int j=0;j<a.length-1-1;j++)
			{
				if(a[j]>=a[j+1])
				{
					int tmp=a[j];
					a[j+1]=a[j];
					a[j]=tmp;
				}
			}
			
			for(int e:a)
			{
			System.out.println(e);
			}
		}

	}

}
