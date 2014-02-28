/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service;

/**
 *
 * @author nkosy
 */
public interface MaintananceLog {
       
    public String getTenantName();
    public String getMaintananceIssue();
    public void setTenantName(String name);
    public void setMaintananceIssue(String issue);
}
