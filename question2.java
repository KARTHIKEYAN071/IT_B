package Question1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question2 {

	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
		txt.sendKeys("watches"+Keys.ENTER);
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/div[2]/h5/span"));
		System.out.println(w1.getText());
		WebElement w2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[2]/div[1]/div/h5/span"));
		System.out.println(w2.getText());
		WebElement w3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[8]/div/div/div/div/div[2]/div[1]/div/h5/span"));
		System.out.println(w3.getText());
		WebElement w4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[13]/div/div/div/div/div[2]/div[1]/div/h5/span"));
		System.out.println(w4.getText());
		WebElement w5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[9]/div/div/div/div/div[2]/div[1]/div/h5/span"));
		System.out.println(w5.getText());
		
		
	}
}
