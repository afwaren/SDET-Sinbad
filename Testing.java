package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testing {
		
	    public static void main(String[] args) throws InterruptedException {
        
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
        
        //Instantiating driver object and launching browser
        driver = new FirefoxDriver();
        
        //Using get() method to open a webpage
        driver.get("https://demo.midtrans.com");
        driver.manage().window().maximize();
        Thread.sleep(500);
        
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/a"));
        login.click();
        
        driver.findElement(By.xpath("//input[@type='number']")).clear();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("80000");
        driver.findElement(By.xpath("//input[contains(@data-reactid,'.0.0.1.0.3.0.0.0.1.0')]")).clear();
        driver.findElement(By.xpath("//input[contains(@data-reactid,'.0.0.1.0.3.0.0.0.1.0')]")).sendKeys("Rendra");
        driver.findElement(By.xpath("//input[contains(@type,'email')]")).clear();
        driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("afwarir@gmail.com");
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.2.1.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.2.1.0']")).sendKeys("081296001289");
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.3.1.0']")).clear();
        driver.findElement(By.xpath("//input[@data-reactid='.0.0.1.0.3.0.0.3.1.0']")).sendKeys("Bogor");
        driver.findElement(By.xpath("//input[@value='10220']")).clear();
        driver.findElement(By.xpath("//input[@value='10220']")).sendKeys("16320");
        
        driver.findElement(By.xpath("//div[@class='cart-checkout'][contains(.,'CHECKOUT')]")).click();
        
        driver.findElement(By.id("//iframe[@id='snap-midtrans']")).click();
        
        
        
        
    }
}