package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\niell\\IdeaProjects\\Dec2021SeleniumProject1.0\\src\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }
    @Test
    public void test1() throws InterruptedException {
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "title validation success");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test2(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium book");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test4(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("echo dot");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test5() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("CeraVe PM Lotion");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test6(){
        driver.findElement(By.tagName("Today's Deals")).click();

    }

    @Test
    public void test7() {
        driver.findElement(By.id("52a8jj-pkghgd-mqfv7l-dlk2gp")).click();
    }

    @Test
    public void test8() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG Tv's");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test9() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LCD Screen Cleaner");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test10() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Whole Home Wifi");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test11() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("JBL Headphones");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test12() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cocomelon Jay-jay");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}