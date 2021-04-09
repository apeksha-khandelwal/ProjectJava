/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import java.util.Date;

import org.jfree.data.general.DefaultPieDataset;


/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class InfoWorkRequest {

    private Date requestedDate;
    private String status;
    private DefaultPieDataset pieChart;

    public DefaultPieDataset getPieChart() {
        return pieChart;
    }

    public void setPieChart(DefaultPieDataset pieChart) {
        this.pieChart = pieChart;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }

    private Employee requestor;
    private UserAccount ua;

    public Employee getRequestor() {
        return requestor;
    }

    public void setRequestor(Employee requestor) {
        this.requestor = requestor;
    }

    private Network network;
    private Organization organization;

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return requestedDate.toString();
    }
}
