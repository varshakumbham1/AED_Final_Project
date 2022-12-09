/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organization.Organization;

/**
 *
 * @author varshareddykumbham
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getorganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType{
        Hospital("Hospital"),
        BloodBank("Blood Bank"),
        FederalGovernment("Federal Government"),
        Rehab("Rehabilitation Center");

        private String type;
        
        private EnterpriseType(String type){
            this.type=type;
        }
        public String getType() {
            return type;
        }
        @Override
        public String toString(){
        return type;
    }
    }

    public EnterpriseType getenterpriseType() {
        return enterpriseType;
    }

    public void setenterpriseType(EnterpriseType eType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.name=type;
        organizationDirectory=new OrganizationDirectory();
    }    
}
