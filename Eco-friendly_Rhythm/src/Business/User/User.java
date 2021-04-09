/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Network.Network;
import Business.WorkQueue.PlantationWorkRequest;
import Business.WorkQueue.SocialWorkRequest;
import Business.WorkQueue.WorkRequest;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;


/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class User {

    private String emailId;
    private String password;
    private String userName;
    private String name;
    private String contactNumber;
    private Date dateOfBirth;
    private String gender;
    private String zip;
    private Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    private File profilePicture;
    private ArrayList<WorkRequest> userRequestList;
    private ArrayList<SocialWorkRequest> socialRequestList;
    private ArrayList<PlantationWorkRequest> plantationRequestList;
    private boolean completeProfile = false;

    public boolean isCompleteProfile() {
        return completeProfile;
    }

    public void setCompleteProfile(boolean completeProfile) {
        this.completeProfile = completeProfile;
    }

    public File getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(File profilePicture) {
        this.profilePicture = profilePicture;
    }


    public User() {
        userRequestList = new ArrayList();
        socialRequestList = new ArrayList();
        plantationRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getUserRequestList() {
        return userRequestList;
    }

    public void setUserRequestList(ArrayList<WorkRequest> userRequestList) {
        this.userRequestList = userRequestList;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addUserRequest(WorkRequest userRequest) {

        userRequestList.add(userRequest);
    }

    public void addPlantationRequest(PlantationWorkRequest userRequest) {

        plantationRequestList.add(userRequest);
    }

    public void addSocialRequest(SocialWorkRequest userRequest) {

        socialRequestList.add(userRequest);
    }

    public ArrayList<SocialWorkRequest> getSocialRequestList() {
        return socialRequestList;
    }

    public void setSocialRequestList(ArrayList<SocialWorkRequest> socialRequestList) {
        this.socialRequestList = socialRequestList;
    }

    public ArrayList<PlantationWorkRequest> getPlantationRequestList() {
        return plantationRequestList;
    }

    public void setPlantationRequestList(ArrayList<PlantationWorkRequest> plantationRequestList) {
        this.plantationRequestList = plantationRequestList;
    }

}
