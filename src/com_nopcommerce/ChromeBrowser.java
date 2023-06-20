package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {

        String MyUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Setup Chrome Browser
        WebDriver Mydriver = new ChromeDriver();

        //Open URL
        Mydriver.get(MyUrl);

        // maximise Browser
        Mydriver.manage().window().maximize();

        //implicit wait to Driver
        Mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print Title of the page
        String MyTitle = Mydriver.getTitle();

        System.out.println("Page Title is :" + MyTitle);

        //Print the current URL

        System.out.println("Current URL is :" + MyUrl);

        //Print the Page Source

        System.out.println("Current page source is : " + Mydriver.getPageSource());

        //Enter Emaiil in to the email field

       Mydriver.findElement(By.id("Email")).sendKeys("JaydeepPrime@Testing.com");

        //Enter Password in to the password field

        Mydriver.findElement(By.name("Password") ).sendKeys("PrimeTestingHomework");


        //Close the Browser
        Mydriver.close();


    }
}
