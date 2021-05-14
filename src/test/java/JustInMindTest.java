import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class JustInMindTest extends TestDriver {
    private static Logger logger = LoggerFactory.getLogger(JustInMindTest.class);

    @Test(enabled = true)
    public void signUp() throws IOException, URISyntaxException {
        JustInMind_SignUp_Page justInMind_signUp_page = new JustInMind_SignUp_Page();

//       Task: Verify that user is able:
//        -to fill out the input fields,
//        -select the Category from the drop-down
//        -click Signup button
//        -validate confirmation

//Input field 1
        justInMind_signUp_page.clickIntoInputField1();
        logger.info("You have clicked into the first input field");

        justInMind_signUp_page.enterInputIntoFullNameField("Captain Freedom");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have entered your full name");


//Input field 2
        justInMind_signUp_page.clickIntoInputField2();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have clicked into the second input field");

        justInMind_signUp_page.enterInputIntoEmailField("superpowers@gmail.com");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have entered your email");


//Input field 3
        justInMind_signUp_page.clickIntoInputField3();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have clicked into the 3d input field");

        justInMind_signUp_page.enterInputIntoAreaOfInterestField("Speed Comics");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have entered your area of interest");
//        DriverUtilities.captureScreenshot(driver,"Area of interest field");
//Dropdown & Dropdown category
        justInMind_signUp_page.selectCategoryFromTheDropDown("Science Fiction & Fantasy");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have selected the category");

//Terms And Conditions checkbox
        justInMind_signUp_page.checkTermsAndConditionsCheckBox();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have accepted terms and conditions");

//SignUp button
        justInMind_signUp_page.clickSignUpButton();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have clicked on a Sign Up button");

//Validate Confirmation
        justInMind_signUp_page.validateConfirmation();
        logger.info("You have successfully validated confirmation");
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

//Click on the "Got it" button
        justInMind_signUp_page.clickButtonGotIt();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        logger.info("You have clicked button 'Got_It' and closed Confirmation page ");
    }
}
