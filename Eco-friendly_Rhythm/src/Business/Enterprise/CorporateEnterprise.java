/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class CorporateEnterprise extends Enterprise {

    public CorporateEnterprise(String name) {
        super(name, EnterpriseType.Corporate);
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
