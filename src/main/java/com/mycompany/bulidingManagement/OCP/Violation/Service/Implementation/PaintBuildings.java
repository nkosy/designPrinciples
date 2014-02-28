/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.OCP.Violation.Service.Implementation;

/**
 *
 * @author nkosy
 */
public class PaintBuildings {
    public void PaintMultispan(Multispan obj)
    {
        System.out.println("Painting Area: " + obj.PaintArea());
        if(obj.PaintArea() > 50);
            System.out.println("Extra bucket of paint needed!");
    }
    
    public void PaintEavesOverHang(EavesOverHang2 obj)
    {
        System.out.println("Painting Area: " + obj.PaintArea());
    }
    
    public void PaintLean_tos(Lean_tos obj)
    {
        System.out.println("Painting Area: " + obj.PaintArea());
    }
}
