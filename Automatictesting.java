package automatictesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatictesting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https:testingbaba.com/old");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys("Pulkit Panwar");
		driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("Pulkitpanwar18@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("Sakoti Tanda");
		driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys("Sakoti Tanda,Meerut");
		driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"tab_1\"]/div/div[2]/label"));
		for(int i=1;i<list.size();i=i+2)
		{
			String text= list.get(i).getText();
			System.out.println(text);
		}
		System.out.println("Sucessfull");
		System.out.println("Again");
		System.out.println("print");
	}


}
