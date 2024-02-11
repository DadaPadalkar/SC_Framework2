package Interview.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo
{
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.close();
        //driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("dadapadalkar65@gmail.com");
        //driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Ycc@1234");
        WebElement login =driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
        Actions act=new Actions(driver);
        act.moveToElement(login).click().build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
       
	}

}
