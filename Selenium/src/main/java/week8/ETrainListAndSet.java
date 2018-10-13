package week8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ETrainListAndSet {

	public static void main(String[] args) throws InterruptedException {
		
			WebElement trainlist;
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			//Maximize browser
			driver.manage().window().maximize();
			driver.get("https://etrain.info/in");
			driver.findElementById("tbsfi1").sendKeys("MAS");
			driver.findElementById("tbsfi3").sendKeys("ED",Keys.TAB);
			driver.findElementById("tbsfi4").click();
			List<WebElement> cal = driver.findElementsByXPath(" (//td[@class=' ui-datepicker-week-end undefined'])[1]/parent::tr");
			//System.out.println(cal.size());
			WebElement row = cal.get(0);
			List<WebElement> col = row.findElements(By.tagName("a"));
			col.get(0).click();
			//System.out.println(col.size());
			Thread.sleep(3000);
			driver.findElementById("tbssbmtbtn").click();
			
			Thread.sleep(1000);
			WebElement trainTable = driver.findElementByXPath("//table[@class='myTable data nocps nolrborder']");
			List<WebElement> trainRows = trainTable.findElements(By.tagName("tr"));
			System.out.println(trainRows.size());
			List<String> allTrainNames = new ArrayList<String>();
			List<String> allTrainNumbers = new ArrayList<String>();
			for(WebElement eachRow : trainRows) 
			{
			List<WebElement> trainNames = eachRow.findElements(By.tagName("td"));
			//System.out.println(trainNames.get(1).getText());
			allTrainNames.add(trainNames.get(1).getText());
			allTrainNumbers.add(trainNames.get(0).getText());
			}
			for(String name : allTrainNames)
				System.out.println(name);
			/*for(int i = 1; i <= trainRows.size(); i++) {
				String xpath = "\"//table[@class='myTable data nocps nolrborder']/tbody/tr["+i+"]/td[2]/a\"";
				System.out.println(xpath);
				WebElement eachTrainName = driver.findElementByXPath(xpath);
				System.out.println(eachTrainName.getText());
			}*/
			
			
	}

}
