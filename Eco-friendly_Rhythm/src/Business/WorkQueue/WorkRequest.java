/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.User.User;
import Business.UserAccount.UserAccount;

import java.util.Date;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public abstract class WorkRequest {

    private Employee coordinatorAssigned;
    private Employee supplierAssigned;
    private User user;
    private String status;
    private String overallStatus;
    private Date requestDate;
    private String Type;

    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    public WorkRequest() {
        requestDate = new Date();
    }

    public Employee getCoordinatorAssigned() {
        return coordinatorAssigned;
    }

    public void setCoordinatorAssigned(Employee coordinatorAssigned) {
        this.coordinatorAssigned = coordinatorAssigned;
    }

    public Employee getSupplierAssigned() {
        return supplierAssigned;
    }

    public void setSupplierAssigned(Employee supplierAssigned) {
        this.supplierAssigned = supplierAssigned;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return Type;
    }
}
