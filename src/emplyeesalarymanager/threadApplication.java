/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplyeesalarymanager;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sameep
 */
public class threadApplication extends Thread{
    String stop = "";
    int a = 1;
    public void setStop(String stop)
    {
        this.stop = stop;
    }
    @Override
    public void run()
    {
        while(!stop.equals("s"))
        {
            System.out.println(a++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(threadApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
