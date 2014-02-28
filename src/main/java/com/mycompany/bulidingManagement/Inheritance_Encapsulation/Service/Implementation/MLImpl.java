

package com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.Implementation;

import com.mycompany.bulidingManagement.Inheritance_Encapsulation.Service.MaintananceLog;

/**
 *
 * @author nkosy
 */
public class MLImpl implements MaintananceLog{
    private String tenantName = "";
    private String maintananceIssue = "";
    MLImpl(String name, String issue)
    {
        setTenantName(name);
        setMaintananceIssue(issue);
    }
    @Override
    public String getTenantName() {
        return tenantName;
    }

    @Override
    public String getMaintananceIssue() {
        return maintananceIssue;
    }

    @Override
    public void setTenantName(String name) {
       this.tenantName = name;
    }

    @Override
    public void setMaintananceIssue(String issue) {
       this.maintananceIssue = issue;
    }
}
