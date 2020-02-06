package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2_CalculateLoanAmt {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
					public static void main(String[] args) throws Exception  {
					WebDriver driver=new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							
					String baseUrl = "https://www.mortgagecalculator.org/";
										
					JavascriptExecutor js = (JavascriptExecutor) driver;

			        // Launch the application		
			        driver.get(baseUrl);

			        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
			        driver.manage().window().maximize();
			        Thread.sleep(1000);

			        // This  will scroll down the page by  1000 pixel vertical		
			        js.executeScript("window.scrollBy(0,500)");
			        Thread.sleep(1000);
			        
			        driver.findElement(By.id("homeval")).sendKeys("400000");
			        Thread.sleep(2000);
			        
			        driver.findElement(By.id("downpayment")).sendKeys("80000");
			        Thread.sleep(2000);
			        
			        driver.findElement(By.id("loanamt")).sendKeys("32000");
			        Thread.sleep(2000);
			        
			        driver.findElement(By.id("intrstsrate")).sendKeys("50");
			        Thread.sleep(2000);
			        
			        driver.findElement(By.id("loanterm")).sendKeys("50");
			        Thread.sleep(1000);
			        
			        driver.findElement(By.id("pptytax")).sendKeys("2500");
			        Thread.sleep(1000);
			        
			        driver.findElement(By.id("pmi")).sendKeys("0.6");
			        Thread.sleep(1000);
			        
			        driver.findElement(By.id("hoi")).sendKeys("1000");
			        Thread.sleep(1000);
			        
			        driver.findElement(By.id("hoa")).sendKeys("1");
			        Thread.sleep(1000);
			        			        
			        Select drpLoanType = new Select(driver.findElement(By.name("param[milserve]")));
					drpLoanType.selectByVisibleText("FHA");
					Thread.sleep(1000);
					
					Select drpBuyOrRefi = new Select(driver.findElement(By.name("param[refiorbuy]")));
					drpBuyOrRefi.selectByVisibleText("Buy");
					Thread.sleep(1000);
					
					Select drpCreditRating = new Select(driver.findElement(By.name("param[credit_rating]")));
					drpCreditRating.selectByVisibleText("Excellent (720+)");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//input[@name='cal']")).submit();
					   driver.switchTo().alert().getText();
					   driver.switchTo().alert().accept();
					   
					   //driver.close();
					  			   
					   
					  }					
		}
