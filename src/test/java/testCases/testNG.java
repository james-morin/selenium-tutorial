package testCases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class testNG {

    public String baseUrl = "http://newtours.demoaut.com/";
    public WebDriver driver = new ChromeDriver();

    @Test (priority = 0)
    public void verifyHomepageTitle() {

    driver.get(baseUrl);
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);

    driver.findElement(By.cssSelector("a[href*='mercurysignon.php']"));
    driver.findElement(By.cssSelector("a[href*='mercuryregister.php']"));
//    driver.findElement(By.cssSelector("td [width='73'][href='mercuryunderconst.php']"));
    driver.findElement(By.linkText("SUPPORT"));
    driver.findElement(By.linkText("CONTACT"));
    
    
    WebElement home = driver.findElement(By.linkText("Home"));
    WebElement flighs = driver.findElement(By.linkText("Flights"));
    WebElement hotels = driver.findElement(By.linkText("Hotels"));
    WebElement carRentals = driver.findElement(By.linkText("Car Rentals"));
    WebElement cruises = driver.findElement(By.linkText("Cruises"));
    WebElement destinations = driver.findElement(By.linkText("Destinations"));
    WebElement vacations = driver.findElement(By.linkText("Vacations"));
//    WebElement useJavaVersion = driver.findElement(By.Xpath("//div[contains(text(), '"Use Java Version"')]"));
    
    
    


    }
    
    @Test (priority = 1)
    public void googleTest(){
    
    driver.get("http://www.gogle.com");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("Cheese");
    element.submit();
    System.out.println("Page title is: " + driver.getTitle());
        
//    (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>(){
//        public Boolean apply(WebDriver d){
//            return d.getTitle().toLowerCase().startsWith("cheese!");
//        }
//    });

        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public void tearDownClass() throws Exception {
                driver.quit();

    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
