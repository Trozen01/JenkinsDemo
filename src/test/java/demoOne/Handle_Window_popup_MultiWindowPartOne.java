package demoOne;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Window_popup_MultiWindowPartOne {
	public WebDriver dr;
	public String URL,Parentwindowhandel;

	@Test
	public void Handel_Window() throws Exception {
		
		try {
			
			URL = "https://www.hyrtutorials.com/p/window-handles-practice.html";

			WebDriverManager.chromedriver().setup();
			dr = new ChromeDriver();
			dr.get(URL);
			dr.manage().window().maximize();
			String PageTitle = dr.getTitle();
			System.out.println("Page Title is:-" + PageTitle);
            Parentwindowhandel = dr.getWindowHandle();
			System.out.println("Parent window name is" + Parentwindowhandel);
			
			
			System.out.println("--------Open New Window--------");
			dr.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
			
			//find after click on button how many window is avaliable for operation.
			 Set <String> handles= dr.getWindowHandles();
			
			 //need if of the each window.
			 for(String handle:handles){
				 
				 System.out.println(handle);
				 if(!handle.equals(Parentwindowhandel) ){
					dr.switchTo().window(handle);
					dr.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abcd");
					Thread.sleep(3000);
					dr.close();
				 }
				 
			 }
			 dr.switchTo().window(Parentwindowhandel);
			 boolean check = dr.findElement(By.xpath("//input[@id='name']")).isEnabled();
			 
			if(check == true){
				dr.findElement(By.xpath("//input[@id='name']")).sendKeys("Window Test");
			    Thread.sleep(3000);
			    dr.close();
			}

		} catch (Exception e) {
			System.out.println("Exception is:=" + e);
			System.out.println("Testing ");
		}

	}

}
// getWindowHandles return Set of string value not a list of values. 
//Because Set of Strig store unique value and list store dublicate value.

