/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
//import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.Hospital.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
