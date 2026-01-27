package SeleniumPac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_PT2 {
  @Test
  public void test4() {
	  System.out.println("TEST4");
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("https://www.yahoo.com/");
      driver.quit();
  }
  @Test
  public void test5()
  {
	  System.out.println("TEST5");
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("https://www.nykaa.com");
      driver.quit();
  }
}
