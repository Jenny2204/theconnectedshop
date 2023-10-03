package com.theconnectedshop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class PrimaryPageTest {
    private WebDriver driver;
    private HomeClass homeClass;


    @Given("I open the website theconnectedshop.com")
    public void open_site() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);

        homeClass = new HomeClass (driver);
        OpenSiteClass openSiteClass = new OpenSiteClass(driver);
        openSiteClass.navigateTo("https://theconnectedshop.com/");
        driver.manage().window().maximize();
    }

    @Then("The URL should contain theconnectedshop.com")
    public void check_current_url() {
        String currentUrl = driver.getCurrentUrl();
        String exPageUrl = "דרוש/ה דרוש/ה תומכ/ת טכני/ת לחברה גדולה בתחום הרכב/";
        if (currentUrl.equalsIgnoreCase(exPageUrl)) {
            System.out.println(" Url correct");
        } else {
            System.out.println("Url isnt correct" + currentUrl);
        }
    }

    @And("Check title homePage")
    public void check_title() {
        String currentGetTitle = driver.getTitle();
        Assert.assertFalse("page title is empty", currentGetTitle.isEmpty());


        // Перевіряємо заголовок і виводимо відповідне повідомлення
        if (currentGetTitle.equals("The Connected Shop - Smart Objects, Connected Devices and IoT Gadgets")) {
            System.out.println("Заголовок сторінки співпадає з очікуваним.");
        } else {
            System.out.println("Заголовок сторінки не співпадає з очікуваним.");
            System.out.println("Заголовок сторінки: " + currentGetTitle);
        }

    }

    @And("Check logo")
    public void testLogoImage() {
    homeClass.logoLink();
    }

    @And("Check main menu")
    public void mainMenuButton() throws InterruptedException {
        homeClass.mainMenuButton();




// NewIn button
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement newIN = driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));
        newIN.isDisplayed();
        newIN.click();
        String actualTitle = driver.getTitle();//
        String expectedTitle = ("New Smart Objects - New Smart Locks, New Smart Sensors & Smart Robots – The Connected Shop");
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("title is correct");
        } else {
            System.out.println("invalid" + "" +  actualTitle);
        }


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Collections button
        WebElement collections = driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));
        collections.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




        @Then("Close site")
        public void close () {
            driver.quit();
        }

    }


