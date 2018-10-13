package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Maximize the window
		driver.get("https://erail.in/");//Give the url to launch
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Tir");
		driver.findElementByXPath("(//div[@class='autocomplete-w1']/div/div[contains(@title,'Tir')])[7]").click();
		
		
		
	}

}
