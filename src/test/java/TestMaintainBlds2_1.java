/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bulidingManagement.Config.AppConfig;
import com.mycompany.bulidingManagement.ISP.Correction.Service.Implementation.MaintainBld2_1;
import com.mycompany.bulidingManagement.ISP.Violation.Service.Implementation.MaintainBldB;
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
public class TestMaintainBlds2_1 {
    public MaintainBld2_1 obj;
    
    public TestMaintainBlds2_1() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
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
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj= (MaintainBld2_1)ctx.getBean("CEO");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
