package SeleniumPac;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC_Alert {
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
		Alert simplealert=driver.switchTo().alert();
		System.out.println("Simple alert text:"+simplealert.getText());
		simplealert.accept();
		
		//for 2nd confirm 
		driver.findElement(By.id("confirm")).click();
		
		Alert confirmealert=driver.switchTo().alert();
		System.out.println("comfirm alert text:"+confirmealert.getText());
		confirmealert.accept();
		
	}
 
}