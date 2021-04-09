/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.User.User;

import java.util.Date;


/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class PlantationWorkRequest extends WorkRequest {

    private String zipcode;
    private int treeCount;
    private Employee CareTakerAssigned;
    private Date pickup;
    private Organization org;

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public Date getPickup() {
        return pickup;
    }

    public void setPickup(Date pickup) {
        this.pickup = pickup;
    }

    public Employee getCareTakerAssigned() {
        return CareTakerAssigned;
    }

    public void setCareTakerAssigned(Employee CareTakerAssigned) {
        this.CareTakerAssigned = CareTakerAssigned;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getTreeCount() {
        return treeCount;
    }

    @Override
    public String toString() {
        return super.getType();
    }

    public void setTreeCount(int treeCount) {
        this.treeCount = treeCount;
    }
}
