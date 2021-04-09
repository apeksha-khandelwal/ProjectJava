/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Organization.Organization.Type.CareTaker;

import Business.Role.CareTaker;
import Business.Role.Role;

import java.util.ArrayList;


/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class CareTakerOrganization extends Organization {
    public CareTakerOrganization() {
        super(Organization.Type.CareTaker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CareTaker());
        return roles;
    }
}
