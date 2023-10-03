package com.theconnectedshop;

import org.openqa.selenium.WebDriver;

    public class OpenSiteClass {
        private WebDriver driver;
        public OpenSiteClass(WebDriver driver){
            this.driver=driver;
        }
        public void navigateTo (String url){
            driver.get(url);
        }
    }

