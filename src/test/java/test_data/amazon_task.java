package test_data;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class amazon_task {
	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
	
		WebElement search=Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("apple mobile");
	Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	Driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	String path="C:\\Users\\HP\\eclipse-workspace\\bhushan\\screenshot_1";
	String rm=RandomString.make(3);
	TakesScreenshot sc=(TakesScreenshot) Driver;
	File screenshot=sc.getScreenshotAs(OutputType.FILE);
	File fic=new File(path+"\\"+rm+".png");
	FileUtils.copyFile(screenshot, fic);
	
	}

}
