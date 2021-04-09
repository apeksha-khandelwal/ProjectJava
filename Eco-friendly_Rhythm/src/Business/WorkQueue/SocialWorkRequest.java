/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Organization.Organization;

import java.util.Date;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class SocialWorkRequest extends WorkRequest {

    private int treeCount;
    private String zipcode;
    private Organization org;
    private Employee manager;
    private String status;
    private Date date;
    private Employee CareTaker;
    private String type;

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

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getCareTaker() {
        return CareTaker;
    }

    public void setCareTaker(Employee CareTaker) {
        this.CareTaker = CareTaker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return zipcode;
    }

}
