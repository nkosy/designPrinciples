/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.bulidingManagement.Polymorphism.Service.Implementation;

import com.mycompany.bulidingManagement.Polymorphism.Service.RoutineMaintanance;
import java.util.Scanner;

/**
 *
 * @author nkosy
 */
public class RMSmallBuilding implements RoutineMaintanance {
    Scanner input = new Scanner(System.in);
    Scanner values = new Scanner(System.in);
    private String team = " ";
    private String lastDate = " ";
    private String nextDate = " ";
    private final double ratePerhour = 150.50;
    private int storedhrs = 0;
    private int inputhrs = 0;
    private double cost;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getNextDate() {
        return nextDate;
    }

    public void setNextDate(String nextDate) {
        this.nextDate = nextDate;
    }

    public int getStoredhrs() {
        return storedhrs;
    }

    public void setStoredhrs(int storedhrs) {
        this.storedhrs = storedhrs;
    }

    public int getInputhrs() {
        return inputhrs;
    }

    public void setInputhrs(int inputhrs) {
        this.inputhrs = inputhrs;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    //for a Small building, the routine maintanace can be done by any maintanace team
    //On and on a specific date.
    
    public void InputRoutineDetails()
    {
        System.out.println("Please type in the maintanace team and \"S\" to stop!");
        team = input.next();
        
        while(team != "S" || team != "s")
        {
            System.out.println("Please type in the date of Last maintanance ddmmyy");
            lastDate = input.next();
        
            System.out.println("Please type in the maintanace cost");
            cost = values.nextDouble();
        
            System.out.println("Please type in the hours worked");
            inputhrs = values.nextInt();
            storedhrs += inputhrs;
        
            System.out.println("Please type in date of next maintanace");
            nextDate = input.next();
            
            System.out.println("Please type in the maintanance team and \"S\" to stop!");
            team = input.next();
        }   
    }
    public double CalculateCosts()
    {
        double tot = 0;
        tot = storedhrs * ratePerhour;
        tot = tot + cost;
        return tot;
    }
    public void PrintReport()
    {
        System.out.println("Last maintained on: " + lastDate);
        System.out.println("Maintanace team:  " + team);
        System.out.println("Maintanance Cost: " + cost);
        System.out.println("Hours worked:  " + storedhrs);
        System.out.println("Next maintanace on:  " + nextDate);
        System.out.println("Total maintanace costs: " + CalculateCosts());
    }
}
