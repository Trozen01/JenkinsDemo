package demoOne;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Window_popup_MultiWindowPartTwo {
	public WebDriver dr;
	public String URL, Parentwindowhandel;

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

			System.out.println("--------Open New Tab--------");
			dr.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

			// find after click on button how many window is avaliable for
			// operation.
			Set<String> handles = dr.getWindowHandles();    //set object not store values on the bases of index their are no ,1,2,3 so we not able to use for loop so we have to use iterator.
			Iterator<String> it = handles.iterator(); // Iterator we use for Iterate all set of strings.

			for (String handle : handles) {
				if (it.hasNext()) {

					String ChildWindow = it.next();
					if (!ChildWindow.equals(Parentwindowhandel)) {
						dr.switchTo().window(ChildWindow);

						System.out.println("Child Window name is:=" + ChildWindow);
						System.out.println("do your operation on Child Window and then close To child window");
						dr.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abcd");
						Thread.sleep(3000);
						dr.close();
						System.out.println("After Close Child winddow need to switch Parent Window");
					}
				}
			}

			dr.switchTo().window(Parentwindowhandel);
			boolean check = dr.findElement(By.xpath("//input[@id='name']")).isEnabled();

			if (check == true) {
				dr.findElement(By.xpath("//input[@id='name']")).sendKeys("Window Test");
				Thread.sleep(2000);
				dr.close();
			}

			System.out.println("Scenario is complected");

		} catch (Exception e) {
			System.out.println("Exception is:=" + e);
		}
	}

}
