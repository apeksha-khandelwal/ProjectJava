/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CareTaker;
import Business.Role.Role;
import Business.Role.Supplier;

import java.util.ArrayList;

import Business.Role.HeadquaterManager;
import Business.Role.Investor;
import Business.Role.Logistics;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class HeadquatersOrganization extends Organization {

    public HeadquatersOrganization() {
        super(Organization.Type.Headquaters.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HeadquaterManager());
        return roles;
    }
}
