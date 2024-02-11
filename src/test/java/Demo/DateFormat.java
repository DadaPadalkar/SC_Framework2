package Demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat 
{

	public static void main(String[] args) 
	{
		Date date=new Date();
		
	SimpleDateFormat format=new SimpleDateFormat("MM/DD/YYYY");
	String dateform=format.format(date);
	System.out.println(dateform);

	}

}
