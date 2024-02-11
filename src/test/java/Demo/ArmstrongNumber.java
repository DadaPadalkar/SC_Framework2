package Demo;

public class ArmstrongNumber
{

	public static void main(String[] args)
	{
		int n=154;
		//count length of number.
		int t1=n;
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length++;			
		}
		System.out.println("Length of Number="+length);
		//to separate each digit from number
		int t2=n;
		int rem=0;
		int arm=0;
		while(t2!=0)
		{
			rem=t2%10;
			//multiplication value 
			int mul=1;
	        for (int i=1;i<=length;i++)
	        {
	        	mul=mul*rem;
	        		
	        }
	        arm=arm+mul;
	        t2=t2/10;  
		}
		
       if (arm==n)
       {
    	   System.out.println("Given Number is Armstrong Number");
       }
       else
       {
    	   System.out.println("Given Number is Not a Armstrong Number");
       }
        
	}
   
}
