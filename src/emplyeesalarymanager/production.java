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
public class production extends parent{

    public production(double basicSalary, int a, int t) {
        super(basicSalary, a, t);
    }
    double bonus, totalSalary;
    public double prodBonus()
    {
       if(actual>target)
       { 
           bonus=0;
       }
       else
       {
        bonus=((target-actual)*15);
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
    public double salesBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
