package com.theconnectedshop;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeClass {
    public static WebDriver driver;
    @FindBy(className = ".Header__LogoImage.Header__LogoImage--primary")
    private WebElement logo;
    @FindBy(className = "HorizontalList")
    private WebElement mainMenu;

    @FindBy(tagName = "li")
    private WebElement li;

    public HomeClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logoLink() {
        String srcValue = logo.getAttribute("src");
        System.out.println("Logo Image Source: " + srcValue);
    }

    public void mainMenuButton() {
        String srcValue = mainMenu.getAttribute("HorizontalList");
        System.out.println("Logo Image Source: " + srcValue);
        List<WebElement> listItems = mainMenu.findElements(By.tagName("li"));
//        WebElement horizontalList = driver.findElement(By.className("HorizontalList"));
//        List<WebElement> listItems = horizontalList.findElements(By.tagName("li"));
        if (!listItems.isEmpty()) {
            for (WebElement li : listItems) {
                WebElement link = li.findElement(By.tagName("a"));
                String linkText = link.getText();
                System.out.println("Link Text: " + linkText);
//                WebElement linkSpacer = li.findElement(By.className("Heading u-h6"));
//                String spacerText = linkSpacer.getText();
//                System.out.println("Spacer Text: " + spacerText);
            }
        } else {
            System.out.println("No list items found on the page.");
        }
        int numberOfLiElements = listItems.size();
        System.out.println("Number of <li> elements: " + numberOfLiElements);


    }
}
    //   Check home button?
//    List<WebElement> listItems1 = driver.findElements(By.className("//header/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
//        if (!listItems1.isEmpty())
//
//    {
////            WebElement firstListItem = listItems1.get();
//        WebElement linka = driver.findElement(By.tagName("a"));
//        String linkTexta = linka.getText();
//        String linkHref = linka.getAttribute("href");
//
//        System.out.println("Link Text: " + linkTexta);
//        System.out.println("Link Href: " + linkHref);
//
//        linka.click(); // Click on the link
//
//    }
//
//      // Perform further actions or assertions on the new page if needed
//    } else{
//
//        System.out.println("No HorizontalList__Item elements found.");
//    }
//    //        Home button
//    WebElement homeLink = driver.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
//        homeLink.click();
//    }}
