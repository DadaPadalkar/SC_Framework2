package Demo;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{


	@Test
	public void demoTest()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
         
	}

}
