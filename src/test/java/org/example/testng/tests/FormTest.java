package org.example.testng.tests;

import org.example.testng.pages.DemoqaForm;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest {

    public static WebDriver driver;
    public static String URI = "https://demoqa.com/automation-practice-form";
    public static String FIRST_NAME = "Catalina";
    public static String LAST_NAME = "Nercas";
    public static String USER_EMAIL = "nercascatalinaw2313@gmail.com";

    public static String USER_GENDER = "Female";
    public static String USER_NUMBER = "0123456789";
    public static String DATE = "15 May 1990";
    public static String SUBJECT = "Maths";
    public static String HOBBY = "Music";
    public static String STATE = "NCR";
    public static String CITY = "Delhi";

    @BeforeTest
    public void beforeTest() {
        // Inițializare driver dacă este cazul
    }

    @Test
    public void formTest() throws InterruptedException {
        System.out.println("Start Test");

        driver.get(URI);
        DemoqaForm form = new DemoqaForm(driver);
        form.setFirstName(FIRST_NAME);
        form.setLastName(LAST_NAME);
        form.setUserEmail(USER_EMAIL);

        form.setGender(USER_GENDER);
        form.setUserNumber(USER_NUMBER);
        form.setDate(DATE);
        form.setSubject(SUBJECT);
        form.setHobby(HOBBY);
        form.setState(STATE);
        form.setCity(CITY);

        Thread.sleep(10000);
        System.out.println("Finish test");
    }

    @AfterTest
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}