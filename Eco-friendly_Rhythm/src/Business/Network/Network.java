/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class Network {
    private String name;
    private String city;
    private String state;
    private String country;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue poolWorkQueue;
    private EnterpriseDirectory enterpriseDirectory;
    private int funds;

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public String getCity() {
        return city;
    }

    public WorkQueue getPoolWorkQueue() {
        return poolWorkQueue;
    }

    public void setPoolWorkQueue(WorkQueue poolWorkQueue) {
        this.poolWorkQueue = poolWorkQueue;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Network() {
        userAccountDirectory = new UserAccountDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        poolWorkQueue = new WorkQueue();
    }

    public Network(String name, String city, String state, String country) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        userAccountDirectory = new UserAccountDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        poolWorkQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}
