/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class NotificationRequest {

    private String type;
    private User informer;
    private String status;
    private Employee headquaterManager;
    private int treeCount;
    private String zipcode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getInformer() {
        return informer;
    }

    public void setInformer(User informer) {
        this.informer = informer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getHeadquaterManager() {
        return headquaterManager;
    }

    public void setHeadquaterManager(Employee headquaterManager) {
        this.headquaterManager = headquaterManager;
    }

    public int getTreeCount() {
        return treeCount;
    }

    public void setTreeCount(int treeCount) {
        this.treeCount = treeCount;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return type;
    }

}
