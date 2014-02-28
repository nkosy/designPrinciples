/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.OCP.Correction.Service.Implementation;

import com.mycompany.bulidingManagement.OCP.Correction.Service.PaintBuildings;

/**
 *
 * @author nkosy
 */
public class EavesOverHang1 implements PaintBuildings {
    private int height = 10;
    private int width = 20;
    
    @Override
    public int paintArea() {
     return height * width;   
    }
    
}
