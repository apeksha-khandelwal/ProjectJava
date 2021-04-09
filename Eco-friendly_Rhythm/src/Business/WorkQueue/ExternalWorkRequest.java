/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkQueue.WorkRequest;


/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class ExternalWorkRequest extends WorkRequest {

    private int noOfTress;
    private String zipcode;
    private String cause;

    public int getNoOfTress() {
        return noOfTress;
    }

    public void setNoOfTress(int noOfTress) {
        this.noOfTress = noOfTress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

}
