/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import com.db4o.collections.ActivatableArrayList;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class WorkQueue {

    private ArrayList<ExternalWorkRequest> workRequestList;
    private ArrayList<InternalWorkRequest> requestList;
    private ArrayList<PlantationWorkRequest> poolList;
    private ArrayList<NotificationRequest> notificationList;
    private ArrayList<SocialWorkRequest> socialList;
    private ArrayList<PaymentWorkRequest> paymentList;

    public ArrayList<PaymentWorkRequest> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(ArrayList<PaymentWorkRequest> paymentList) {
        this.paymentList = paymentList;
    }

    private ArrayList<InfoWorkRequest> infoList;

    public ArrayList<InfoWorkRequest> getInfoList() {
        return infoList;
    }

    public void setInfoList(ArrayList<InfoWorkRequest> infoList) {
        this.infoList = infoList;
    }

    public ArrayList<PlantationWorkRequest> getPoolList() {
        return poolList;
    }

    public void setPoolList(ArrayList<PlantationWorkRequest> poolList) {
        this.poolList = poolList;
    }

    public WorkQueue() {
        workRequestList = new ArrayList();
        requestList = new ArrayList();
        poolList = new ArrayList();
        notificationList = new ArrayList();
        socialList = new ArrayList();
        infoList = new ArrayList();
        paymentList = new ArrayList();
    }

    public ArrayList<SocialWorkRequest> getSocialList() {
        return socialList;
    }

    public void setSocialList(ArrayList<SocialWorkRequest> socialList) {
        this.socialList = socialList;
    }

    public ArrayList<ExternalWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<NotificationRequest> getNotificationList() {
        return notificationList;
    }

    public ArrayList<InternalWorkRequest> getRequestList() {
        return requestList;
    }
}