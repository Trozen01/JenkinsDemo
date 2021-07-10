package demoOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
public WebDriver dr;
public String url;
@Test
public void Fileupload() throws InterruptedException{
	
	url="https://html.com/input-type-file/";
	WebDriverManager.chromedriver().setup();
	dr = new ChromeDriver();
	dr.get(url);
	dr.manage().window().maximize();
	dr.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:/Users/Trozen/Downloads/Test_Engineer_Jitendra.doc");
	Thread.sleep(2000);
}

}

// if you have type="File" in inspect element then we need to use send key.
//1.alert ==javascript popup--Alert api(accept, dismiss)
//2.File upload pop up --Browse button (type ="File" the we can use sendkey)
//3.Browser window pop up --Advertisement popup(windowHandeler API - getwindowHandles()) 