package Interview.interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xoriant 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Actions act=new Actions(driver);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(list.size());
		for(WebElement key:list)
		{
			String text=key.getText();
			System.out.println(text);
			if(text.contains("selenium webdriver"))
			{
				key.click();
				break;
			}
		}
		
		
		
	
}
}
