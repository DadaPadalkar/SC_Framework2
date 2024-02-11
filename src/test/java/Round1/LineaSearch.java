package Round1;

public class LineaSearch 
{

	public static void main(String[] args) 
	{
		int arr[]= {12,4,5,7,8,77,5,3,2,1};
		int Search=76;
		boolean status=false;
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==Search)
			{
				System.out.println("Element "+Search+" is Present In Array at "+(i+1)+"th Location");
				status=true;
				break;
			}
			
		}
		if (status==false)
		{
			System.out.println("Element is not Present in Array");
		}

	}

}
