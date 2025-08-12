 package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.linkText("YouTube")).click();
//		driver.quit();
	
		driver.get("https://shoppersstack.com/products_page/25");
		String parentId = driver.getWindowHandle();
		Thread.sleep(18000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		allWindowId.remove(parentId);
		
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			
			driver.close();
			
		}
		
		driver.switchTo().window(parentId);
		
		driver.close();
	}

}
