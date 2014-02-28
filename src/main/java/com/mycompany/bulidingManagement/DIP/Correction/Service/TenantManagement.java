/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.DIP.Correction.Service;

import java.util.ArrayList;
/**
 *
 * @author nkosy
 */
public interface TenantManagement {
    ArrayList<String> tenantList = new ArrayList<String>();
    public void AddTenant(String tenantName);
    public void RemoveTenant (String name);
    public String DisplayTenants();
}
