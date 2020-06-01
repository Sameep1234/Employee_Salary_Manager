/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplyeesalarymanager;

import java.util.Scanner;

/**
 *
 * @author Sameep
 */
public class EmplyeeSalaryManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = sc.nextInt();
        int type[] = new int[n];
        double basicSalary[] = new double[n];
        int a[] = new int[n];
        int t[] = new int[n];
        int cont = 1;
        int k=0;
        parent p[] = new parent[n];
        while(cont == 1)
        {
            System.out.println("Enter 1 for sales and 2 for production.");
            type[k] = sc.nextInt();
            if(type[k] == 1)
            {
                System.out.println("Enter the basic salary of the employee.");
                basicSalary[k] = sc.nextDouble();
                System.out.println("Enter sales actual.");
                a[k] = sc.nextInt();
                System.out.println("Enter sales target.");
                t[k] = sc.nextInt();
                p[k] = new sales(basicSalary[k], a[k], t[k]);
                System.out.println("Press 1 to continue and 2 to exit");
                cont = sc.nextInt();
                k++;
            }
            else
            {
                System.out.println("Enter the basic salary of the employee.");
                basicSalary[k] = sc.nextDouble();
                System.out.println("Enter production actual.");
                a[k] = sc.nextInt();
                System.out.println("Enter production target.");
                t[k] = sc.nextInt();
                p[k] = new production(basicSalary[k], a[k], t[k]);
                System.out.println("Press 1 to continue and 2 to exit");
                cont = sc.nextInt();
                k++;
            }
        }
        System.out.println("Enter the password to access the details of the employee.");
        int password = sc.nextInt();
        System.out.println("Press s and then press enter key to stop threading");
        if(password == 123)
        {
            String stop="";
            threadApplication ta = new threadApplication();
            ta.start();
            stop = sc.next();
            ta.setStop(stop);
            for(int i=0;i<k;i++)
            {
                if(type[i] == 1)
                {
                    p[i].fixedSalary();
                    p[i].salesBonus();
                    System.out.println("The salary for empyolee (sales) "+(i+1)+" is "+p[i].totalSalary());
                }
                else
                {
                    p[i].fixedSalary();
                    p[i].prodBonus();
                    System.out.println("The salary for empyolee (production) "+(i+1)+" is "+p[i].totalSalary());
                }
            }
        }
        else
        {
            System.out.println("You are not authorised to view this information.");
        }
    }
    
}
