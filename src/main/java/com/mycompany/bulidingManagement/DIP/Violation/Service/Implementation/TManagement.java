
package com.mycompany.bulidingManagement.DIP.Violation.Service.Implementation;

import java.util.ArrayList;

/** This program managers the Tenants in a building
 *This class contains methods that adds, removes and displays
 * tenants on an arrayList
 * Author: Nkosikhona Sibanda (212018183)
 * Date Created: 28 February 2014
 * 
 */
public class TManagement {
    
    private ArrayList<String> tenantList = new ArrayList<String>();  
    private TenantManagement obj;
    
    public String ManageTenants()
    {
        obj = new TenantManagement();
        obj.AddTenant("VanSchaick", tenantList);
        obj.AddTenant("NCC", tenantList);
        obj.AddTenant("e-TV", tenantList);
       
        obj.setTenantList(tenantList);
        return "" + tenantList;
    }
}
