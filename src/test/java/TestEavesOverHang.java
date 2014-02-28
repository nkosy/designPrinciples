/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bulidingManagement.Config.AppConfig;
import com.mycompany.bulidingManagement.OCP.Correction.Service.Implementation.EavesOverHang1;
import com.mycompany.bulidingManagement.OCP.Correction.Service.PaintBuildings;
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
public class TestEavesOverHang {
    public static EavesOverHang1 obj;
    
    public TestEavesOverHang() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public static void TestPaintArea() {
        int expected = 200;
        Assert.assertEquals(obj.paintArea(), 200, "Testing");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj= (EavesOverHang1)ctx.getBean("testEOH");
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
