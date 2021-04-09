/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        NGO("NGO"),
        Supplier("Supplier"),
        Government("Government"),
        University("University"),
        Investor("Investor"),
        CareTaker("CareTaker"),
        Corporate("Corporate"),
        Informer("Informer"),
        ActiveParticipant("ActiveParticipant"),
        SystemAdminRole("SystemAdminRole"),
        LogisticsRole("LogisticsRole"),
        InventoryWorker("InventoryWorker");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
                                          UserAccount account,
                                          Organization organization,
                                          Enterprise enterprise,
                                          EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }


}