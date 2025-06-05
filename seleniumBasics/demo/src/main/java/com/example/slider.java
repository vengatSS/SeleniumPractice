/**
 * Main class for the com.example package.
 * Entry point for the Selenium practice demo application.
 */
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        WebElement location1=driver.findElement(By.xpath("/html/body/div[2]/div[2]/span[1]"));
        System.out.println("Location of the element: " + location1.getLocation());
        WebElement location2=driver.findElement(By.xpath("/html/body/div[2]/div[2]/span[2]"));
        System.out.println("Location of the element: " + location2.getLocation());
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(location1,100, 256).perform();
        actions.dragAndDropBy(location2,-100, 249).perform();
        
        

    }
}