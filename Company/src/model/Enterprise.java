package model;

import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Enterprise {
    
    private ArrayList <Employee>  employee;
    private ArrayList<Client> client;

    public Enterprise() {
        this.employee = new ArrayList<>();
        this.client = new ArrayList<>();
    }



    public ArrayList <Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList <Employee> employee) {
        this.employee = employee;
    }

    public ArrayList<Client> getClient() {
        return client;
    }

    public void setClient(ArrayList<Client> client) {
        this.client = client;
    }
    
    public void hireEmployee (Employee employee){
        getEmployee().add(employee);
    }
  
    public void linkClient (Client client){
        getClient().add(client);
    }
}
