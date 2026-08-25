
package com.techcorp;

public class Manager extends Employee
{

    public Manager(String name, double baseSalary)
    {
        super(name, baseSalary);
    }

    
    public String getRole()
    {
        return "Manager";
    }

    
    public double calculateBonus() 
    {
        return baseSalary * 0.20;
    }
}
