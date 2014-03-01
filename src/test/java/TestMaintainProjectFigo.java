/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bulidingManagement.Config.AppConfig;
import com.mycompany.bulidingManagement.SRP.Violation.Service.Implementation.MaintainProjectFigo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class TestMaintainProjectFigo {
    public static MaintainProjectFigo obj;
     
    
    public TestMaintainProjectFigo() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @TestMaintainProjectFigo. For example:
    //
    @Test
    public void TestMaintainElevator()
    {
        boolean ans = true;
        boolean val;
        
        val = obj.MaintainElevator();
        assertEquals(ans, val);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj= (MaintainProjectFigo)ctx.getBean("PM");
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
