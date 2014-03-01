
package com.mycompany.bulidingManagement.LSP.Violation.Service;

/**
 *
 * @author nkosy
 */
public interface Projects {
    //Every building has a plumping system that has to be maintained
    public boolean InstallPlumping();
    
    //Not every building has an elevator
    public boolean MaintainElevator();   
}
