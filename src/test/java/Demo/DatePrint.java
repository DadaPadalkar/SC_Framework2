package Demo;

import java.sql.*;

public class DatePrint 
{

	public static void main(String[] args) 
	{
		long milis=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(milis);
		java.sql.Time time=new java.sql.Time(milis);
		System.out.println(date);
		System.out.println(time);	
		SQLDATE();
	}
	public static void SQLDATE()
	{
		String s="25-05-2023";
		
		Date date=Date.valueOf(s);
		System.out.println(date);
	}

}
