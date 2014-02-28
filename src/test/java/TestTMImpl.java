/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bulidingManagement.Config.AppConfig;
import com.mycompany.bulidingManagement.DIP.Correction.Service.Implementation.TMImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nkosy
 */
public class TestTMImpl {
    public static TMImpl obj;
    
    public TestTMImpl() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   public void testDisplayTenants()
   {
        obj.AddTenant("VanSchaik");
        obj.AddTenant("NCC");
        obj.AddTenant("e-TV");
        
        String expected = "[VanSchaik, NCC, e-TV]";
        Assert.assertEquals(expected, obj.DisplayTenants());
        
        obj.RemoveTenant("NCC");
        expected = "[VanSchaik, e-TV]";
        Assert.assertEquals(expected, obj.DisplayTenants());
   }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj= (TMImpl)ctx.getBean("testTM");
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
