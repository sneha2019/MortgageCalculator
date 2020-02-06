package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_TitleDisplayTest {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
				public static void main(String[] args) throws Exception  {
				WebDriver driver=new ChromeDriver();
						
				String baseUrl = "https://www.mortgagecalculator.org/";
				String expectedTitle = "Mortgage Calculator";
				String actualTitle = "";

				driver.get(baseUrl);
        
				actualTitle = driver.getTitle(); // get the actual value of the title

				//compare the actual title of the page with the expected one and print the result as "Passed" or "Failed"
         
				if (actualTitle.contentEquals(expectedTitle)){
					System.out.println("Test Passed!");
					}
				else 
				{
					System.out.println("Test Failed");
				}
       
				driver.close();  //close chromedriver
       
				}
	}