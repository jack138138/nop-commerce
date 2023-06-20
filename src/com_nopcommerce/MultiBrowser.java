package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String MyBrowser = "Edge";

    static String MyBaseURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    static WebDriver Mydriver;

    public static void main(String[] args) {

        if (MyBrowser.equalsIgnoreCase("Chrome")) {
            Mydriver = new ChromeDriver();

        } else if (MyBrowser.equalsIgnoreCase("Firefox")) {
            Mydriver = new FirefoxDriver();

        } else if (MyBrowser.equalsIgnoreCase("Edge")) {
            Mydriver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

        Mydriver.get(MyBaseURL);
        Mydriver.manage().window().maximize();
        Mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Print Page Title

        System.out.println("Page Title is:" + Mydriver.getTitle());

        //Print the Current URL

        System.out.println("Page URL is:" + MyBaseURL);

        //Print Page sourceCode

        System.out.println("My Page Source Is :" + Mydriver.getPageSource());

        //Enter The EMail In Email Field
        Mydriver.findElement(By.id("Email")).sendKeys("JaydeepTesting@Prime.com");

        //Enter Password to password field
        Mydriver.findElement(By.name("Password")).sendKeys("TestingPrime");

        Mydriver.close();
    }

}







