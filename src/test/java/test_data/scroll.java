package test_data;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {
	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/login/");
		Driver.manage().window().maximize();
		
		JavascriptExecutor ex=(JavascriptExecutor) Driver;
		ex.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(5000);
		ex.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(5000);
		
	 WebElement english	=Driver.findElement(By.xpath("//li[text()='English (UK)']"));
	 english.click();
	 ex.executeScript("arguments[0].scrollIntoView()", english);
	}
	

}
