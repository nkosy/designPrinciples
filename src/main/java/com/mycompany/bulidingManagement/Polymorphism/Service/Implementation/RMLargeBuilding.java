package com.mycompany.bulidingManagement.Polymorphism.Service.Implementation;

import java.util.Scanner;

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
/**
 *
 * @author nkosy
 */
public class RMLargeBuilding extends RMSmallBuilding{
    Scanner values = new Scanner(System.in);
    public RMLargeBuilding()
    {
        super();
    }
    
    @Override
    //Only the AlphaTeam does the routine maintanace for the Large building
    //Alpha_Team only works 50 hours for a maintanance job
    public void InputRoutineDetails()
    {
        super.setTeam("Alpha_Team");
        
        System.out.println("Please type in the maintanace cost");
        double cost = values.nextDouble();
        super.setCost(cost);
        
        super.setStoredhrs(50);
        super.setLastDate("N/A");
        super.setNextDate("13/04/2014");
    }
}
