/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bulidingManagement.Config.AppConfig;
import com.mycompany.bulidingManagement.LSP.Correction.Service.Implementation.ProjectStrathavon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nkosy
 */
public class TestProjectStrathavon {
    public static ProjectStrathavon obj;
    public TestProjectStrathavon() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public static void TestPrintDetails()
    {
        String expected = "Elevator Maintanance has been done!";
        Assert.assertEquals(expected, obj.PrintDetails());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj= (ProjectStrathavon)ctx.getBean("testPSTV");
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
