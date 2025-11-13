package com.example.demo_projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initial {

	public static void main(String[] args) throws InterruptedException {
	       WebDriverManager.chromedriver().setup();

	       WebDriver driver = new ChromeDriver();

           driver.get("https://www.opencart.com/index.php?route=cms/demo");
           
	       System.out.println("Title: " + driver.getTitle());
           Thread.sleep(5000); 
	       driver.quit();

	}

}
