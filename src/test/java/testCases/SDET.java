/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author james
 */
public class SDET {

    public WebDriver driver = new ChromeDriver();
    public String baseUrl = "http://xpanxion.com/";
    public String baseUrl2 = "http://xpanxion.com/contact.html";
    
    By xpanxionAbout_Navbar = By.id("u115");
    By xpanxionAproach_Navbar = By.id("u126");
    By xpanxionServices_Navbar = By.id("u119");
    By xpanxionCareers_Navbar = By.id("u15732");
    By xpanxionContact_Navbar = By.id("u140");
    
    By xpanxionAbout_Footer = By.id("u10570-4");
    By xpanxionOurstory_Footer = By.id("u10578-4_img");
    By xpanxionLocations_Footer = By.id("u10577-4");
    By xpanxionMission_Footer = By.id("u10576-4");
    By xpanxionNews_Footer = By.id("u10575-4");
    
    By xpanxionSubmitButton_Contactpage = By.id("u1679-17");
    


    @Test (priority = 1)
    public void xpanxionHomepageNavbarNavigation() {
    driver.get(baseUrl);
    WebElement myDynamicElement = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionAbout_Navbar));
    driver.findElement(xpanxionAbout_Navbar).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement1 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionAproach_Navbar));
    driver.findElement(xpanxionAproach_Navbar).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement2 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionServices_Navbar));
    driver.findElement(xpanxionServices_Navbar).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement3 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionCareers_Navbar));
    driver.findElement(xpanxionCareers_Navbar).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement4 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionContact_Navbar));
    driver.findElement(xpanxionContact_Navbar).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    }
    
    @Test (priority = 2)
    public void xpanxionHomepageFooterNavigation() {
    driver.get(baseUrl);
    WebElement myDynamicElement = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionAbout_Footer));
    driver.findElement(xpanxionAbout_Footer).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement11 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionOurstory_Footer));
    driver.findElement(xpanxionOurstory_Footer).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement22 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionLocations_Footer));
    driver.findElement(xpanxionLocations_Footer).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement33 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionMission_Footer));
    driver.findElement(xpanxionMission_Footer).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    driver.navigate().back();
    WebElement myDynamicElement44 = (new WebDriverWait(driver, 20))
        .until(ExpectedConditions.presenceOfElementLocated(xpanxionNews_Footer));
    driver.findElement(xpanxionNews_Footer).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
//    driver.quit();
        
    }
    
    @Test (priority = 3)
    public void xpanxionContactpageValidation() {
    driver.get(baseUrl2);
    driver.findElement(xpanxionSubmitButton_Contactpage).click();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    
    String actualColor = "rgba(215, 36, 76, 1)";
    String nameColor = driver.findElement(By.id("widgetu1680_input")).getCssValue("color");
    String emailColor = driver.findElement(By.id("widgetu1684_input")).getCssValue("color");
    String cellphoneColor = driver.findElement(By.id("widgetu1691_input")).getCssValue("color");
    
    Assert.assertEquals(nameColor, actualColor);
    Assert.assertEquals(emailColor, actualColor);
    Assert.assertEquals(cellphoneColor, actualColor);
        
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
