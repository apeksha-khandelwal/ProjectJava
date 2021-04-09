/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;

import java.util.ArrayList;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.NGO.getValue())) {
            organization = new NGOOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Headquaters.getValue())) {
            organization = new HeadquatersOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Logistic.getValue())) {
            organization = new LogisticOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Investor.getValue())) {
            organization = new InvestorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Corporate.getValue())) {
            organization = new CorporateOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Government.getValue())) {
            organization = new GovernmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Supplier.getValue())) {
            organization = new SupplierOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CareTaker.getValue())) {
            organization = new CareTakerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Administrator.getValue())) {
            organization = new AdministratorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}