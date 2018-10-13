package week8;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Maximize browser
		driver.manage().window().maximize();
		driver.get("https://etrain.info/in");
		driver.findElementById("tbsfi1").sendKeys("MAS",Keys.TAB);
		System.out.println(driver.findElementById("tbsfi1").getAttribute("text"));
	}

}
