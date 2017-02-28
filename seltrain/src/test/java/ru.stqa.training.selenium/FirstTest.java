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

public class FirstTest {


        public WebDriver driver;
        public WebDriverWait wait;

        @Before
        public void start() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
        }

        @Test
        public void myFirstTest() {
            driver.navigate().to("http://www.google.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.name("q")).sendKeys("webdriver");
            driver.findElement(By.name("btnG")).click();
            wait.until(titleIs("webdriver - Поиск в Google"));
        }


        @After
        public void stop() {
            driver.quit();
            driver = null;
        }

}
