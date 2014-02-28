/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.LSP.Correction.Service.Implementation;

import com.mycompany.bulidingManagement.LSP.Violation.Service.Implementation.ProjectFigo;

/**
 *
 * @author nkosy
 */
public class ProjectStrathavon extends ProjectFigo2{
    public ProjectStrathavon()
    {
        super();
    }
    
    public String PrintDetails()
    {
        boolean status = super.MaintainElevator();
        
        if( status == true)
            return "Elevator Maintanance has been done!";
        
        return "Elevator Maintanance not done!";
      
    }
    
}
