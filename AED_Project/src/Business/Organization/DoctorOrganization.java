/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author haroonperveez
 */
public class DoctorOrganization extends Organization {
    
       public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
         roles = new HashSet<>();
         roles.add(new DoctorRole() );
         return roles;
    }
    }
    

