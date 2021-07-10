package demoOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleDoc {
	public static WebDriver dr;
	public static String url;	
	
	@Test
	public void GoogleDocuments() throws InterruptedException{
		
		System.out.println("entering before suite");

		url = "https://docs.google.com/forms/d/e/1FAIpQLSebKfNGpYkhGHUlhR5itkFZwqc9P_9eB_PlAevq6_FGfsP_5A/viewform";
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\java\\Browserexe\\chromedriver.exe");

		// 2.open crome driver.
		dr = new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div[@id='i8']//div//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i24']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i37']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i53']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i72']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i91']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i111']//div[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox']")).click();
		dr.findElement(By.xpath("//div[@id='i114']//div[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox']")).click();
		dr.findElement(By.xpath("//div[@id='i137']//div[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox']")).click();
		dr.findElement(By.xpath("//div[@id='i146']//div[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox']")).click();
		dr.findElement(By.xpath("//div[@id='i174']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i193']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i215']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i228']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i250']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i266']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//div[@id='i283']//div[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox']")).click();
		dr.findElement(By.xpath("//div[@id='i292']//div[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox']")).click();
		dr.findElement(By.xpath("//div[@id='i308']//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']")).click();
		dr.findElement(By.xpath("//span[contains(text(), 'Submit')]")).click();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		
		dr.quit();
		
		
	}

}
