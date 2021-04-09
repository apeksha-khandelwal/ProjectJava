/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class UserDirectory {
    ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserDirectory() {
        return userList;
    }

    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userList = userDirectory;
    }

    public User addUser() {

        User user = new User();
        userList.add(user);
        return user;

    }

    public void addUserDefault(String emailId, String userName, String password, String name, char type, String contactNumber, Date dateOfBirth, String gender, String emergencyContactNumber, String relation, String address, String zip, String state, String city, boolean heart, boolean liver, boolean lungs, boolean kidney, boolean eyes) {
        User user = new User();
        userList.add(user);
        user.setEmailId(emailId);
        user.setPassword(password);
        user.setUserName(userName);
        user.setName(name);
        user.setContactNumber(contactNumber);
        user.setZip(zip);
        user.setDateOfBirth(dateOfBirth);
        user.setGender(gender);
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (User ua : userList) {
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }

    public boolean checkIfEmailidExist(String emailId) {
        for (User user : userList) {
            if (user.getEmailId().equals(emailId)) {
                return true;
            }
        }
        return false;
    }

    public User createUser(String name) {
        User user = new User();
        user.setName(name);
        userList.add(user);
        return user;
    }

    public User authenticateUser(String username, String password) {
        for (User user : userList) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
