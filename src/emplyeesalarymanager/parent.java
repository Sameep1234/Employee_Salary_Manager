/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplyeesalarymanager;

/**
 *
 * @author Sameep
 */
public abstract class parent {
    double fixedSalary;
    int actual, target;
    double basicSalary;
    parent(double basicSalary, int a, int t)
    {
        this.basicSalary = basicSalary;
        this.target = t;
        this.actual = a;
    }
    public double fixedSalary()
    {
        fixedSalary = (basicSalary) + (basicSalary * 0.4) + (basicSalary * 0.1) + (basicSalary * 0.1);
        return fixedSalary;
    }
    public abstract double totalSalary();
    public abstract double salesBonus();
    public abstract double prodBonus();
}
