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
public class sales extends parent{
    double bonus, totalSalary;
    public sales(double basicSalary, int a, int t) {
        super(basicSalary, a, t);
    }
    public double salesBonus()
    {
       if(actual>target)
       { 
           bonus=((actual-target)*100);
       }
       else
       {
        bonus=0;
       }
       return bonus;
    }
    public double totalSalary()
    {
       totalSalary = bonus + fixedSalary;
       System.out.println(totalSalary);
       return totalSalary;
    }

    @Override
    public double prodBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
