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

import java.awt.CardLayout;

import userinterface.AdministrativeRole.AdminWorkAreaJPanel;

import javax.swing.JPanel;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
                                 UserAccount account,
                                 Organization organization,
                                 Enterprise enterprise,
                                 EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business);
//        userProcessContainer.add("AdminWorkAreaJPanel",jpanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
//        jpanel.setVisible(true);
    }


}
