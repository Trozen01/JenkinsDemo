package demoOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
public static WebDriver dr;
public static String url;	
	
	@Test
	public void sum() throws InterruptedException{
		
		System.out.println("Sum Demo for Jenking");
		int a= 10;
		int b= 20;
		int c= a+b;
		System.out.println("Sum is ="+c);
		
		System.out.println("entering before suite");

		url = "https://www.google.co.in/";
		WebDriverManager.chromedriver().setup();
		
		// 2.open crome driver.
		dr = new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		dr.quit();
	}

}
