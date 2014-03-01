package com.mycompany.bulidingManagement.Config;

import com.mycompany.bulidingManagement.DIP.Correction.Service.Implementation.TMImpl;
import com.mycompany.bulidingManagement.DIP.Correction.Service.TenantManagement;
import com.mycompany.bulidingManagement.DIP.Violation.Service.Implementation.TManagement;
import com.mycompany.bulidingManagement.ISP.Correction.Service.Implementation.MaintainBld2_1;
import com.mycompany.bulidingManagement.ISP.Violation.Service.Implementation.MaintainBldB;
import com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.Implementation.PrintLog;
import com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.MaintananceLog;
import com.mycompany.bulidingManagement.LSP.Correction.Service.Implementation.ProjectStrathavon;
import com.mycompany.bulidingManagement.LSP.Violation.Service.Implementation.ProjectFigo;
import com.mycompany.bulidingManagement.OCP.Correction.Service.Implementation.EavesOverHang1;
import com.mycompany.bulidingManagement.OCP.Violation.Service.Implementation.EavesOverHang2;
import com.mycompany.bulidingManagement.PLK.Violation.Service.Implementation.Report;
import com.mycompany.bulidingManagement.Polymorphism.Service.Implementation.RMSmallBuilding;
import com.mycompany.bulidingManagement.Polymorphism.Service.RoutineMaintanance;
import com.mycompany.bulidingManagement.SRP.Correction.Service.Implementation.AlfaProject;
import com.mycompany.bulidingManagement.SRP.Violation.Service.Implementation.MaintainProjectFigo;
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
    
    @Bean(name = "Alfa")
    public AlfaProject getAService(){
        return new AlfaProject();
    }
    
    @Bean(name = "PM")
    public MaintainProjectFigo getPMService(){
        return new MaintainProjectFigo();
    }
    
    @Bean(name = "MBA")
    public MaintainBldB getMBAService(){
        return new MaintainBldB();
    }
    
    @Bean(name = "CEO")
    public MaintainBld2_1 getCEOervice(){
        return new MaintainBld2_1();
    }
    
    @Bean(name = "DIY")
    public Report getDIYervice(){
        return new Report();
    }
}
