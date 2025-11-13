package com.example.demo_projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		/*
		driver.get("https://www.opencart.com/index.php?route=marketplace/extension&member_token=f86f5b306553e7cd08e8501f73a7494c");
				
		driver.findElement(By.name("filter_search")).sendKeys("Android");
      
		//By className
		
		boolean logoIsDisplayed = driver.findElement(By.className("company-logo")).isDisplayed();
		System.out.println(logoIsDisplayed);
		Thread.sleep(3000);
		
		//By linkText and partialLinkText
		//for href attributes only
		
		//driver.findElement(By.linkText("Features")).click();
		driver.findElement(By.partialLinkText("atu")).click();
		Thread.sleep(3000);
		
		//By id, name mostly used for locating single element
		
		//By tagName,className mostly used for locating multiple elements
		
		List<WebElement> links = driver.findElements(By.xpath("//ul[contains(@class,'navbar-nav')]//li"));
		System.out.println("total no of header links are: "+" "+links.size());
				
		//By tagName
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("total images on pages are: "+images.size());
		
		*/
		
		//By cssSelectors
		driver.get("https://demo.nopcommerce.com/");
		
		//tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shirts");
		
		//tag.className: space in b/w className so used two dots
		driver.findElement(By.cssSelector("button.button-1.search-box-button")).click();
		
		//tag[attribute="value"]
		driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']")).click();
		
		//tag.className[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Tablets");
		
		//Xpath: Absolute and Relative and relative is preferred because if dev changes any element our absolute
		//xpath will not be able to locate the element
		
		//tagName[@attribute='value']
		driver.findElement(By.xpath("//img[@title = 'Show products in category Electronics']")).click();
		
		//with multiple attribute
		driver.findElement(By.xpath("//img[@title = 'Show products in category Camera & photo'][@alt='Picture for category Camera & photo']")).click();
		
		//And Or Operator
		//driver.findElement(By.xpath("//img[@title = 'Show products in category Camera & photo' and @alt='Picture for category Camera & photo']")).click();
		
		//driver.findElement(By.xpath("//img[@title = 'Show products in category Camera & photo' and @alt='Picture for category Camera & photo']")).click();
		
		// xpath with inner text()
		//driver.findElement(By.xpath("//a[text() =  'MacBook']")).click();
		
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("Mobile");
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
