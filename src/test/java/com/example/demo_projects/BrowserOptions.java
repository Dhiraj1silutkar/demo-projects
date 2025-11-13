package com.example.demo_projects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
	/*	
		//Setting for headless mode of execution
		ChromeOptions opt = new ChromeOptions();		
		opt.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com");
		
		//Headless Testing
		//Test case runs in back-end --> Chrome Browser will not be shown
		//Simplify stating without seeing any UI your test case will run
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("nopCommerce demo store. Home page title")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
				
		//Advantages of using headless mode
		//1.We can do multiple tasks (Since execution happens at the backend)
		//2.Faster execution
		
		//Disadvantages
		//1.User can't see any UI action
		
        //Mostly prefer after the user knows all the UI actions/flows
		
		
		//Secure Socket Layer(SSL) 
		//When you are handling some website that website needs SSL certificate to browse such type of webpages, they will provide some kind of security
		
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);   //accepts SSL certificate
		
	    WebDriver driver = new ChromeDriver(opt);
	
	    driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title: "+driver.getTitle());
		
		//Run test case using incognito mode
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
	    WebDriver driver = new ChromeDriver(opt);
	
	    driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");
		
		System.out.println("Title: "+driver.getTitle());
		
	*/
		//Enable Extensions
		
		ChromeOptions opt = new ChromeOptions();
		
		File file = new File("C:\\Users\\dhira\\OneDrive\\Documents\\SelectorsHub-Chrome-Web-Store (1).crx");
		opt.addExtensions(file);
		
	    WebDriver driver = new ChromeDriver(opt);
	
	    driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		System.out.println("Title: "+driver.getTitle());
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
