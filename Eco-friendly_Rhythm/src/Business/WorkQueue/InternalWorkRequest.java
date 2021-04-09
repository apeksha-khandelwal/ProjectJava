/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.User.User;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class InternalWorkRequest extends WorkRequest {

    private int totalBill;
    private Employee emp;

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "Headquarter requirement";
    }


    public Employee getEmployee() {
        return emp;
    }

    public void setEmployee(Employee emp) {
        this.emp = emp;
    }
}
