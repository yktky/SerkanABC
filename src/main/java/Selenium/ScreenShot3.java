package Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot3 {
    WebDriver driver;

    @BeforeMethod
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.hubspot.com/login");
    }

    @Test
    public void TakecreenShoot() throws IOException {
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("batch15@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("321654");

        WebElement loginBtn = driver.findElement(By.id("loginBtn"));
        // loginBtn.click();

        WebElement all = driver.findElement(By.id("hs-login"));

        BrowserUtils.wait(2);
        WebElement allAfter = driver.findElement(By.id("hs-login"));

        TakeElementScreenShot(email, "emailsrc");
        BrowserUtils.wait(1);
        TakeElementScreenShot(password, "passwordSrc");
        BrowserUtils.wait(1);
        TakeElementScreenShot(loginBtn, "loginsrc");//"loginsrc"This we want to give randomly name
        BrowserUtils.wait(1);
        TakeElementScreenShot(all, "beforeallsrc");
        loginBtn.click();
        BrowserUtils.wait(1);
        TakeElementScreenShot(allAfter, "allaftersrc");
        BrowserUtils.wait(1);


    }

    @Test
    public void TakeElementScreenShot(WebElement element, String filename) throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) element);  // for each element we cast to element, alsos we add parameter WebElement element,
        // and we want to give filename we use this parameter as String filename >>>>>String filenameThis parameter also not mandatory we want give file name
        File srcfile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile, new File("./test-output/Screenshoot/" + filename + ".png"));

    }


}
