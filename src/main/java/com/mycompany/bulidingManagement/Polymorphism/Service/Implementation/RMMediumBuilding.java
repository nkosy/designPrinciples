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

package com.mycompany.bulidingManagement.Polymorphism.Service.Implementation;

/**
 *
 * @author nkosy
 */
//with the Large building there is also an elevator maintanace done by the Bravo_Team
public class RMMediumBuilding extends RMSmallBuilding {
    public RMMediumBuilding()
    {
        super();
    }
    
    public void InputElavatorDetails()
    {
        super.setTeam("Bravo_Team");
        
        System.out.println("Please type in the date of Last maintanance ddmmyy");
        String lastDate = input.next();
        super.setLastDate(lastDate);
        
        System.out.println("Please type in the maintanace cost");
        double cost = values.nextDouble();
        super.setCost(cost);
        
        System.out.println("Please type in the hours worked");
        int storedhrs = values.nextInt();
        super.setStoredhrs(storedhrs);
        
        System.out.println("Please type in date of next maintanace");
        String nextDate = input.next();
        super.setNextDate(nextDate);
    }
}
