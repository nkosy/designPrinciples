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

package com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.Implementation;

/**
 *
 * @author nkosy
 */
public class PrintLog  extends MLImpl{
    public PrintLog(String name, String issue)
    {
        super(name, issue);
    }
    
    @Override
    public String toString()
    {
        return("Tenant Name: " + super.getTenantName() + "," + " Maintanance Issue: " + super.getMaintananceIssue());
    }
}
    
