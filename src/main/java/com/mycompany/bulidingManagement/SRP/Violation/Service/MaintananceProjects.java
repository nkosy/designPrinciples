
package com.mycompany.bulidingManagement.SRP.Violation.Service;

import com.mycompany.bulidingManagement.LSP.Violation.Service.*;

/**
 *
 * @author nkosy
 */
public interface MaintananceProjects {
    //Every building has a plumping system that has to be maintained
    public boolean InstallPlumping();
    
    //Not every building has an elevator
    public boolean MaintainElevator();   
}
