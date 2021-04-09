/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Supplier;
import Business.Role.Role;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class SupplierOrganization extends Organization {

    ArrayList<Supplier> supList;

    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
        supList = new ArrayList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Supplier());
        return roles;
    }
}
