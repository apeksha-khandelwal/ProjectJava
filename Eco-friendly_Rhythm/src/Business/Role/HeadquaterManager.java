/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JPanel;

import userinterface.HeadquaterRole.HeadquarterManagerJPanel;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class HeadquaterManager extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
                                 UserAccount account,
                                 Organization organization,
                                 Enterprise enterprise,
                                 EcoSystem business) {
        return new HeadquarterManagerJPanel(userProcessContainer, account, business, organization, enterprise, business);
    }


}
