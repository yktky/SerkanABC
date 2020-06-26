package Selenium;

import Utils.BrowserUtils;
import Utils.ExcellUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Excell6 {

    public static void main(String[] args) throws IOException {
        ExcellUtils ex = new ExcellUtils("C:/Users/darak/Desktop/Practice.xlsx");
        String firstName = ex.getData(1,0);
        System.out.println(firstName);
        String lastname = ex.getData(1,1);
        System.out.println(lastname);
        String email = ex.getData(1,2);
        System.out.println(email);
        String reemail = ex.getData(1,1);
        System.out.println(reemail);
        String password = ex.getData(1,4);
        System.out.println(password);
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_m")).sendKeys(firstName);
        BrowserUtils.wait(1);

        driver.findElement(By.id("u_0_o")).sendKeys(lastname);
        BrowserUtils.wait(3);

        driver.findElement(By.id("u_0_r")).sendKeys(email);
        BrowserUtils.wait(3);
        driver.findElement(By.id("u_0_u")).sendKeys(reemail);
        BrowserUtils.wait(5);
        driver.findElement(By.id("u_0_w")).sendKeys(password);


        BrowserUtils.wait(5);

    }
}
