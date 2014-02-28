/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.Config;

import com.mycompany.bulidingManagement.DIP.Correction.Service.Implementation.TMImpl;
import com.mycompany.bulidingManagement.DIP.Violation.Service.Implementation.TManagement;
import com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.Implementation.PrintLog;
import com.mycompany.bulidingManagement.LSP.Correction.Service.Implementation.ProjectStrathavon;
import com.mycompany.bulidingManagement.LSP.Violation.Service.Implementation.ProjectFigo;
import com.mycompany.bulidingManagement.OCP.Correction.Service.Implementation.EavesOverHang1;
import com.mycompany.bulidingManagement.OCP.Violation.Service.Implementation.EavesOverHang2;
import com.mycompany.bulidingManagement.Polymorphism.Service.Implementation.RMSmallBuilding;
import com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.MaintananceLog;
import com.mycompany.bulidingManagement.Polymorphism.Service.RoutineMaintanance;
import com.mycompany.bulidingManagement.DIP.Correction.Service.TenantManagement;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author nkosy
 */
@org.springframework.context.annotation.Configuration
public class AppConfig {
    @Bean(name = "testMILog")
    public MaintananceLog getService(){
        return new PrintLog("Standard bank", "Air conditioning system not working");
    }
    
    @Bean(name = "testRM")
    public RoutineMaintanance getRMService(){
        return new RMSmallBuilding();
    }
    
    @Bean(name = "testTM")
    public TenantManagement getTMService(){
        return new TMImpl();
    }
    
    @Bean(name = "testVTM")
    public TManagement getTService(){
        return new TManagement();
    }
    
    @Bean(name = "testPF")
    public ProjectFigo getPFService(){
        return new ProjectFigo();
    }
    
    @Bean(name = "testPSTV")
    public ProjectStrathavon getSTVService(){
        return new ProjectStrathavon();
    }
    
    @Bean(name = "testEOH")
    public EavesOverHang1 getEOHService(){
        return new EavesOverHang1();
    }
    
    @Bean(name = "EOH")
    public EavesOverHang2 getEOService(){
        return new EavesOverHang2();
    }
}
