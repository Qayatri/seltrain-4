package ru.stqa.training.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class TestAutMag {


    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testAutMag() {
        driver.navigate().to("http://localhost/litecart/admin");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("remember_me")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Catalog")).click();

        driver.navigate().to("http://localhost/litecart/admin");
        driver.findElement(By.linkText("DYMO Print")).click();
    }


    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}
