/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.CareTaker;
import Business.Role.HeadquaterManager;
import Business.Role.Investor;
import Business.Role.Logistics;
import Business.Role.Role;
import Business.Role.Supplier;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class HeadquatersEnterprise extends Enterprise {

    public HeadquatersEnterprise(String name) {
        super(name, EnterpriseType.Headquaters);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Supplier());
        roles.add(new Investor());
        roles.add(new HeadquaterManager());
        roles.add(new CareTaker());
        roles.add(new Logistics());
        return roles;
    }

}
