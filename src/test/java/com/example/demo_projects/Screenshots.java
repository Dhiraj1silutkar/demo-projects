package com.example.demo_projects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com");
		
		//1.Take full screenshots
		//TakesScreenshot interface 
	/*	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//targetFile: we are using it because sourceFile is being created anywhere we don't know where it is created
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		
		//copy sourceFile to targetFile
		sourceFile.renameTo(targetFile);
		
		
		//2. Capture specific part as a screenshot
		
		WebElement featureProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile = featureProducts.getScreenshotAs(OutputType.FILE);
		
		//targetFile: we are using it because sourceFile is being created anywhere we don't know where it is created
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\featureProducts.png");
				
		//copy sourceFile to targetFile
		sourceFile.renameTo(targetFile);
		
	*/
		//3. Capture screenshot of WebElement
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		
		//targetFile: we are using it because sourceFile is being created anywhere we don't know where it is created
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
				
		//copy sourceFile to targetFile
		sourceFile.renameTo(targetFile);
		
		
		driver.quit();
	}

}
