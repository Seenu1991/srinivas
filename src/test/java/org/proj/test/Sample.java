package org.proj.test;

import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws AWTException {
   
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRABHU\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
	WebDriver dri = new ChromeDriver();
	dri.get("https://www.amazon.in");
	dri.manage().window().maximize();
	
	Actions a = new Actions(dri);
	
	dri.findElement(By.id("twotabsearchtextbox")).sendKeys("iphonex");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	List<WebElement> itms = dri.findElements(By.xpath("//*[@id=\"pdagDesktopSparkleDescription1\"]"));

   int s = itms.size();
   System.out.println(s);
   
   
   for(WebElement x : itms) {
	   System.out.println(x.getText());
	   
   }
itms.get(0).click();
itms.get(9).click();
    
	
	}

}
