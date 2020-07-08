package com.herokuapp.theinternet;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PostitiveTests {
	
	@Test
	public void loginTest() {
		
		System.out.println("Test is in process now");
		
		//Steps to create a test
		//1. Create Driver
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		
		sleep(3000);
		
		//2. open the test page
//		String url= "http://www.locateitsolutions.com.au/wp-login.php";
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page Opened Successfully");
		sleep(1000);
		
		//3. enter username
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		
//		WebElement username = driver.findElement(By.xpath("/html//input[@id='user_login']"));
//		username.sendKeys("developer");
//		
		sleep(1000);
		
		//4. enter password
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!"); 
		
//		WebElement password = driver.findElement(By.xpath("/html//input[@id='user_pass']"));
//		password.sendKeys("Developer00");
		
		sleep(1000);
		
		//5. Click login button 
		
		WebElement logInBtn = driver.findElement(By.tagName("button"));
		logInBtn.click();
		
//		WebElement rem = driver.findElement(By.xpath("/html//input[@id='rememberme']"));
//		rem.click();
//		sleep(1000);
//		
//		
//		WebElement logInBtn = driver.findElement(By.xpath("/html//input[@id='wp-submit']"));
//		logInBtn.click();
		
		sleep(2000);
		
		
		
		
//		6. verifications:
//			a. new url
//			b. Logout Button is visible
		WebElement successMessage = driver.findElement(By.cssSelector("#flash"));
		successMessage.click();
		sleep(1000);
		
		
		WebElement logOutBtn = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		logOutBtn.click();
		
//			c. login success message.
		
		
		
		
		sleep(2000);
		
		//Close browser
		driver.quit();
		
		
		
		
	}

	private void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
