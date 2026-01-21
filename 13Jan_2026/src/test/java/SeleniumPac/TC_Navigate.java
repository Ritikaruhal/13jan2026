package SeleniumPac;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC_Navigate {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("Title:"+driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(1500);
		System.out.println("Title after back:"+driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(1500);
		System.out.println("Title after forward:"+driver.getTitle());
	}
 
}
