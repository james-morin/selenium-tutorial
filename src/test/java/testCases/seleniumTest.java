/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCases;

import com.xpanxion.selenium.tutorial.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;


@Config(
        browser = Browser.FIREFOX,
        url     = "http://seleniumhq.org"
)

public class seleniumTest extends Locomotive{
    
    public seleniumTest() {
    }

    @Test
    public void testDownloadLinkExists(){
        validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);

    }


    @Test
    public void testTabExists(){
        validatePresent(HomePage.LOC_LNK_PROJECTSTAB)
                .validatePresent(HomePage.LOC_LNK_DOWNLOADTAB)
                .validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB)
                .validatePresent(HomePage.LOC_LNK_SUPPORTTAB)
                .validatePresent(HomePage.LOC_LNK_ABOUTTAB);

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
