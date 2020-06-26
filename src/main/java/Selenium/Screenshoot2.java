package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshoot2 {

    WebDriver driver;

    @BeforeMethod
    public void test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.hubspot.com/login");
    }

    @Test
    public void TakeScreenShoot() throws IOException {
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("batch15@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("321654");

        WebElement loginBtn = driver.findElement(By.id("loginBtn"));
        loginBtn.click();

        TakesScreenshot srcshot = ((TakesScreenshot)driver); //pay attention casting driver----we getting whole page
        File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./test-output/Screenshot/Wholepage.png"));

    }
}
