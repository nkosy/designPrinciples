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
 */

package com.mycompany.bulidingManagement.DIP.Correction.Service.Implementation;

import com.mycompany.bulidingManagement.DIP.Correction.Service.TenantManagement;
import java.util.Scanner;

/**
 *
 * @author nkosy
 */
public class TMImpl implements TenantManagement {
    Scanner input = new Scanner(System.in);
    @Override
    public void AddTenant(String tenantName) {
        try{
           tenantList.add(tenantName);
        }
        catch(Exception ex){
            System.out.println("Cannot add tenant " + ex.toString());
        }
    }

    @Override
    public void RemoveTenant(String name) {
        try
        {
            for(int i = 0; i < tenantList.size(); i++)
            {
                if(name == tenantList.get(i))
                {
                    tenantList.remove(i);
                    System.out.println("Tenant removed!");                
                }
                else
                {
                    System.out.println("Tenant does not exist");
                }
            } 
        }
        catch(Exception ex)
        {
            System.out.println("Error! remove tenant! " + ex.toString());
        }
    }
    
    public String DisplayTenants()
    {
        return "" + tenantList;
    }
}
