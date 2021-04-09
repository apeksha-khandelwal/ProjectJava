 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package Business.Enterprise;

 import Business.Organization.Organization;
 import Business.Organization.OrganizationDirectory;

 /**
  * @author Alekhya
  * @author Apeksha
  * @author Shalini
  */

 public abstract class Enterprise extends Organization {

     private EnterpriseType enterpriseType;
     private OrganizationDirectory organizationDirectory;

     public enum EnterpriseType {
         NGO("NGO"),
         Headquaters("Headquaters"),
         Corporate("Corporate"),
         Government("Government");

         private String value;

         private EnterpriseType(String value) {
             this.value = value;
         }

         public String getValue() {
             return value;
         }

         public void setValue(String value) {
             this.value = value;
         }

         @Override
         public String toString() {
             return this.value;
         }

     }

     public Enterprise(String name, EnterpriseType type) {
         super(name);
         enterpriseType = type;
         organizationDirectory = new OrganizationDirectory();
     }

     public EnterpriseType getEnterpriseType() {
         return enterpriseType;
     }

     public void setEnterpriseType(EnterpriseType enterpriseType) {
         this.enterpriseType = enterpriseType;
     }

     public OrganizationDirectory getOrganizationDirectory() {
         return organizationDirectory;
     }

     public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
         this.organizationDirectory = organizationDirectory;
     }

     @Override
     public String toString() {
         return getName();
     }
 }
