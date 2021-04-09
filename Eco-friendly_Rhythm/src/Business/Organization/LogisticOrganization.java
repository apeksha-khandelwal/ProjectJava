/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Logistics;
import Business.Role.NGO;
import Business.Role.Role;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class LogisticOrganization extends Organization {

    public LogisticOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Logistics());
        return roles;
    }

}
