package project1week4;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) {
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.amazon.in");//Give the url to launch
		driver.get("https://www.amazon.in/gp/goldbox/ref=nav_cs_gb");
		//driver.findElementByLinkText("Today's Deals").click();
		driver.findElementByXPath("//span[contains(text(),\"See more\")]").click();
		driver.findElementById("twotabsearchtextbox").sendKeys("Ultra Endura Pressure Cooker");
		driver.findElementByXPath("//input[@type='submit']").click();
		List<WebElement> titleList = driver.findElementsByXPath("//div[@class='a-row a-spacing-none']/a/h2");
		List<WebElement> priceList = driver.findElementsByXPath("//span[@class='a-size-base a-color-price s-price a-text-bold']");
		Iterator<WebElement> titleItr = titleList.iterator(); 
		Iterator<WebElement> priceItr = priceList.iterator();
		
		while(titleItr.hasNext() && priceItr.hasNext()) 
		{
			String title = titleItr.next().getText();
			String price = priceItr.next().getText();
			System.out.println(title);
			System.out.println(price);
			System.out.println();
		}
	}

}
