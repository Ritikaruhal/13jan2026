package SeleniumPac;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12 {

    WebDriver driver;
    Properties prop;
    WebDriverWait wait;
    Actions actions;

    @BeforeClass
    public void setUp() throws Exception {
        prop = new Properties();
        boolean loaded = false;

        try (InputStream is = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("configure.properties")) {
            if (is != null) {
                prop.load(is);
                loaded = true;
                System.out.println("Loaded properties from classpath: configuration/config.properties");
            }
        }

        if (!loaded) {
            String fallbackPath = System.getProperty("user.dir") + File.separator + "configure.properties";
            File f = new File(fallbackPath);
            if (f.exists()) {
                try (FileInputStream fis = new FileInputStream(f)) {
                    prop.load(fis);
                    loaded = true;
                    System.out.println("Loaded properties from file: " + f.getAbsolutePath());
                }
            }
        }

        if (!loaded) {
            throw new IllegalStateException(
                "Could not find properties. Place at src/test/resources/configuration/config.properties "
              + "OR projectRoot/configure.properties");
        }

        WebDriverManager.chromedriver().clearResolutionCache().forceDownload().setup();

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        // options.addArguments("--headless=new"); // enable if needed

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
    }

    private By by(String key) {
        String locator = prop.getProperty(key);
        if (locator == null) throw new RuntimeException("Missing key: " + key);
        int idx = locator.indexOf('=');
        if (idx < 1) throw new RuntimeException("Invalid locator format for key " + key + ": " + locator);

        String type = locator.substring(0, idx).trim().toLowerCase();
        String value = locator.substring(idx + 1).trim();

        switch (type) {
            case "id": return By.id(value);
            case "name": return By.name(value);
            case "css": return By.cssSelector(value);
            case "xpath": return By.xpath(value);
            case "linktext": return By.linkText(value);
            case "partiallinktext": return By.partialLinkText(value);
            case "class": return By.className(value);
            case "tag": return By.tagName(value);
            default: throw new RuntimeException("Unsupported locator type: " + type);
        }
    }

    @Test
    public void lab4() {
        driver.get(prop.getProperty("base.url"));

        Assert.assertTrue(
            wait.until(ExpectedConditions.titleContains(prop.getProperty("title.contains"))),
            "Title should contain: " + prop.getProperty("title.contains")
        );

        WebElement desktops = wait.until(ExpectedConditions.visibilityOfElementLocated(by("desktops.menu")));
        actions.moveToElement(desktops).pause(Duration.ofMillis(200)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(by("desktops.showAll"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(by("mac.link"))).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(by("mac.heading"))).isDisplayed());

        WebElement sort = wait.until(ExpectedConditions.visibilityOfElementLocated(by("sort.dropdown")));
        new Select(sort).selectByVisibleText(prop.getProperty("sort.visible.text"));

        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(by("addToCart.first")));
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block:'center'}); arguments[0].click();", addBtn
        );

        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(by("top.search.box")));
        searchBox.clear();
        searchBox.sendKeys(prop.getProperty("search.term"));
        wait.until(ExpectedConditions.elementToBeClickable(by("top.search.button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(by("search.criteria"))).clear();

        WebElement desc = wait.until(ExpectedConditions.elementToBeClickable(by("search.in.description")));
        if (!desc.isSelected()) desc.click();

        wait.until(ExpectedConditions.elementToBeClickable(by("search.submit"))).click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
