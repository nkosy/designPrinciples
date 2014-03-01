/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bulidingManagement.Config.AppConfig;
import com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.Implementation.PrintLog;
import com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.MaintananceLog;
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
public class testPrintLog {
    public static MaintananceLog log1;
    String name;
    String issue;
    
    @Test
    public void TestToString(){
        String name = "Standard Bank";
        String issue = "Air Conditioning not working";
        String expected = "Tenant Name: Standard Bank, Maintanance Issue: Air Conditioning not working";
            
        PrintLog log = new PrintLog(name, issue);
        Assert.assertEquals(expected, log.toString());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        log1 = (MaintananceLog)ctx.getBean("testMILog");
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
