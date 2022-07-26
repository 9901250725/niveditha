package mm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register
{
	@Test
	public void Register() throws InterruptedException
     {
    	System.setProperty("webdriver.chrome.driver", "./s/chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://mobileworld.azurewebsites.net/");	
 		driver.manage().window().maximize();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("niveditha");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("reddy");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("nivi29@gmail.com");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("nivi@29");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12-07-2022");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9901250725");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hiiiii");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
 		Thread.sleep(2000);
 		driver.switchTo().alert().accept();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[@type='Submit']")).click();
 		Thread.sleep(2000);
 		driver.switchTo().alert().accept();
 		Thread.sleep(2000);
 	    driver.findElement(By.id("username")).sendKeys("niveditha");
 		Thread.sleep(5000);
 		driver.findElement(By.id("password")).sendKeys("nivi1997");
 		Thread.sleep(5000);
 		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
 		Thread.sleep(5000);
 		driver.quit();


}
}