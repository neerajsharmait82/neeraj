package com.swindon.neeraj.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    public static WebDriver driver;

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() throws Throwable {

        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("https:gmail.com");
            driver.manage().window().maximize();
        }
    }

    @When("^I enter the valid credentials$")
    public void i_enter_the_valid_credentials() throws Throwable {

        driver.findElement(By.id("identifierId")).sendKeys("neerajsharmait82@gmail.com");
        driver.findElement(By.className("RveJvd.snByac")).click();

    }

    @Then("^I want to see the home page$")
    public void i_want_to_see_the_home_page() throws Throwable {

    }
}
