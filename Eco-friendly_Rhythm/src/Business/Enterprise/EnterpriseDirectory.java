/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }


    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;


        if (type == EnterpriseType.Government) {
            enterprise = new GovernmentEnterprise(name);
        } else if (type == EnterpriseType.NGO) {
            enterprise = new NGOEnterprise(name);
        } else if (type == EnterpriseType.Corporate) {
            enterprise = new CorporateEnterprise(name);
        } else if (type == EnterpriseType.Headquaters) {
            enterprise = new HeadquatersEnterprise(name);
        }

        enterpriseList.add(enterprise);

        return enterprise;
    }

    public void removeEnterprise(Enterprise e) {
        enterpriseList.remove(e);
    }

    public boolean checkIfEnterpriseExists(String enterpriseName, EnterpriseType type) {
        for (Enterprise e : enterpriseList) {
            if ((e.getEnterpriseType() == type) && (e.getName().equals(enterpriseName))) {
                return true;
            }
        }
        return false;
    }

}
