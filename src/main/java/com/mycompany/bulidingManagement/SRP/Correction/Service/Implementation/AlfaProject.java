/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.SRP.Correction.Service.Implementation;

import com.mycompany.bulidingManagement.SRP.Correction.Service.ProjectsAlfa;
import java.util.Scanner;

/**
 *
 * @author nkosy
 */
public class AlfaProject implements ProjectsAlfa {
    Scanner input = new Scanner(System.in);
    
    //Only for buildings with elevators
    public boolean MaintainElevator()
    {
        System.out.println("Please check if All the maintanance for the elevator has been done\n");
        System.out.println("Safety circuit");
        System.out.println("Hoistway");
        System.out.println("Door motor brushes");
        System.out.println("Limit Switches");
        
        System.out.println("Check Y/N");
        char check = 'Y';
        
        if(check == 'Y')
            return true;
        return false; 
    }
}
