package com.techcorp;

public final class Intern extends Employee 
{

    public Intern(String name, double baseSalary)
    {
        super(name, baseSalary);
    }

    
    public String getRole() 
    {
        return "Intern";
    }

    
    public double calculateBonus() 
    {
        return 500.0;
    }
}