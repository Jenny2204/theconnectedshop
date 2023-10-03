package com.theconnectedshop;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

//public class ElementsButton {
//    private WebDriver driver;
//    @And("Check Home button")
//    public void HomeButton(){
//        WebElement horizontalList = driver.findElement(By.className("HorizontalList"));
//        List<WebElement> listItems = horizontalList.findElements(By.tagName("li"));
//
//        if (!listItems.isEmpty()) {
//            for (WebElement listItem : listItems) {
//                WebElement link = listItem.findElement(By.tagName("a"));
//                String linkText = link.getText();
//                System.out.println("Link Text: " + linkText);
//            }
//        } else {
//            System.out.println("No list items found on the page.");
//        }
//        int numberOfLiElements = listItems.size();
//        System.out.println("Number of <li> elements: " + numberOfLiElements);
//    }
//}
