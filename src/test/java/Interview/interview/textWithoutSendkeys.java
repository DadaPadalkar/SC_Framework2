package Interview.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textWithoutSendkeys 
{

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Actions act=new Actions(driver);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchBox=driver.findElement(By.xpath("//textarea[@title='Search']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='Ajay'", SearchBox);
         js.executeScript("document.getElementById('APjFqb').value=\"Aayush\"");
	}

}
