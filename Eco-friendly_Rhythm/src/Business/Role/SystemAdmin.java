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
import javax.swing.JPanel;

import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */

public class SystemAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
                                 UserAccount account,
                                 Organization organization,
                                 Enterprise enterprise,
                                 EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, organization, business);
//        userProcessContainer.add("SystemAdminWorkAreaJPanel",jpanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
//        jpanel.setVisible(true);
    }


}
