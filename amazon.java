package Question1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	
		public static void main(String args[]) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/MuscleBlaze-100-Whey-Protein-Chocolate/dp/B01H1L7I2I/ref=sr_1_1_sspa?crid=IR5ZILW0SONJ&keywords=muscleblaze%2Bwhey%2Bprotein&qid=1681289402&sprefix=%2Caps%2C297&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		driver.manage().window().maximize();
		
		WebElement addtocart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addtocart.click();
		
		WebElement gotocart=driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a"));
		gotocart.click();
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
		amt.click();
		Thread.sleep(2000);
		WebElement amt5=driver.findElement(By.xpath("//*[@id=\"quantity_5\"]"));
		amt5.click();
		WebElement totalamt=driver.findElement(By.xpath("//*[@id=\"sc-subtotal-amount-activecart\"]/span"));
		System.out.println(totalamt.getText());
		
		WebElement removeitem=driver.findElement(By.name("submit.delete.C6e244ca1-75b8-4b5f-89e1-7784ed34941d"));
		removeitem.click();
		
		
		
		
	}
}
