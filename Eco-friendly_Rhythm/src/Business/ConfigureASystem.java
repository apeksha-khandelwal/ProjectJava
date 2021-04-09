package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.CareTaker;
import Business.Role.Corporate;
import Business.Role.Government;
import Business.Role.HeadquaterManager;
import Business.Role.Informer;
import Business.Role.Investor;
import Business.Role.Logistics;
import Business.Role.NGO;
import Business.Role.Role;
import Business.Role.Supplier;
import Business.Role.SystemAdmin;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.InternalWorkRequest;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alekhya
 * @author Apeksha
 * @author Shalini
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //create admin
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        system.getUserAccountDirectory().createEmployeeAccount("sysadmin", "sysadmin", "", employee, new SystemAdmin());

        //Create a network
        Network network = new Network("BostonNetwork", "Boston", "MA", "US");
        system.getNetworkList().add(network);
        network.setFunds(600);

        //create user
        User u = system.getUserDirectory().addUser();
        u.setName("Informer");
        u.setUserName("Informer");
        u.setPassword("Informer");
        u.setEmailId("khandelwal.ap@northeastern.edu");
        u.setNetwork(network);
        network.getUserAccountDirectory().createUserAccount("Informer", "Informer", "7989078878", u, new Informer());

        //create user account
        Employee employee2 = system.getEmployeeDirectory().createEmployee("Admin");
        employee2.setEmailId("khandelwal.ap@northeastern.edu");
        network.getUserAccountDirectory().createEmployeeAccount("Admin", "apeksha", "", employee2, new AdminRole());

        network.getEnterpriseDirectory().createAndAddEnterprise("BostonGovernment",
                Enterprise.EnterpriseType.Government);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonCorporate",
                Enterprise.EnterpriseType.Corporate);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonHEadquarters",
                Enterprise.EnterpriseType.Headquaters);
        network.getEnterpriseDirectory().createAndAddEnterprise("BostonNGO",
                Enterprise.EnterpriseType.NGO);

        EnterpriseDirectory ed = network.getEnterpriseDirectory();
        Organization o;

        for (Enterprise ent : ed.getEnterpriseList()) {
            if (ent.getEnterpriseType() == Enterprise.EnterpriseType.Corporate) {
                //alekhya
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Corporate);
                o.setName("OrgCorporate");
                User e = new User();
                e.setName("Corporate");
                e.setNetwork(network);
                e.setUserName("Corporate");
                e.setEmailId("khandelwal.ap@northeastern.edu");
                e.setPassword("Corporate");
                o.getUserAccountDirectory().createUserAccount("Corporate", "Corporate", "2222222222", e, new Corporate());
            } else if (ent.getEnterpriseType() == Enterprise.EnterpriseType.Government) {
                //government
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Government);
                o.setName("OrgGovernment");
                Employee gvrt = new Employee();
                gvrt.setName("Government");
                gvrt.setUserName("Government");
                gvrt.setEmailId("khandelwal.ap@northeastern.edu");
                gvrt.setPassword("Government");
                o.getUserAccountDirectory().createEmployeeAccount("Government", "Government", "79890798907", gvrt, new Government());
            } else if (ent.getEnterpriseType() == Enterprise.EnterpriseType.Headquaters) {
                //manager
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Headquaters);
                o.setName("OrgHeadquarters");
                Employee m = new Employee();
                m = new Employee();
                m.setName("Manager");
                m.setUserName("Manager");
                m.setEmailId("khandelwal.ap@northeastern.edu");
                m.setPassword("Manager");
                o.getUserAccountDirectory().createEmployeeAccount("Manager", "Manager", "2002200222", m, new HeadquaterManager());
                //logistics
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Logistic);
                o.setName("OrgLogistics");
                Employee e1 = new Employee();
                e1.setName("Logistics");
                e1.setUserName("Logistics");
                e1.setEmailId("khandelwal.ap@northeastern.edu");
                e1.setPassword("Logistics");
                o.getUserAccountDirectory().createEmployeeAccount("Logistics", "Logistics", "2909090902", e1, new Logistics());
                //investor
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Investor);
                o.setName("OrgInvestors");
                User i = new User();
                i.setName("Investor");
                i.setUserName("Investor");
                i.setEmailId("khandelwal.ap@northeastern.edu");
                i.setNetwork(network);
                i.setPassword("Investor");
                o.getUserAccountDirectory().createUserAccount("Investor", "Investor", "2234566782", i, new Investor());
                //careTaker
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.CareTaker);
                o.setName("OrgCareTaker");
                Employee e = new Employee();
                e.setName("Caretaker");
                e.setUserName("Caretaker");
                e.setEmailId("khandelwal.ap@northeastern.edu");
                e.setPassword("Caretaker");
                o.getUserAccountDirectory().createEmployeeAccount("Caretaker", "Caretaker", "2214567780", e, new CareTaker());
                InternalWorkRequest request = new InternalWorkRequest();
                request.setTotalBill(20);
                request.setRequestDate(new Date());
                request.setEmployee(e);
                request.setCoordinatorAssigned(m);
                request.setStatus("delivered");
                request.setOverallStatus("Completed");
                request.setType("Headquarter Requirements");
                o.getWorkQueue().getRequestList().add(request);
                e.addEmployeeRequest(request);
                m.addEmployeeRequest(request);
                //supplier
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.Supplier);
                o.setName("OrgSupplier");
                Employee s = new Employee();
                s.setName("Supplier");
                s.setUserName("Supplier");
                s.setEmailId("khandelwal.ap@northeastern.edu");
                s.setPassword("Supplier");
                o.getUserAccountDirectory().createEmployeeAccount("Supplier", "Supplier", "22", s, new Supplier());
                request.setSupplierAssigned(s);
                s.addEmployeeRequest(request);
            } else {
                o = ent.getOrganizationDirectory().createOrganization(Organization.Type.NGO);
                o.setName("OrgNGO");
                User s = new User();
                s.setName("NGO");
                s.setUserName("NGO");
                s.setNetwork(network);
                s.setEmailId("khandelwal.ap@northeastern.edu");
                s.setPassword("ngoOrganization");
                o.getUserAccountDirectory().createUserAccount("NGO", "ngoOrganization", "2456677442", s, new NGO());
            }
        }

        return system;
    }
}
