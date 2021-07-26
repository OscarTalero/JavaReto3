package model;

/**
 *
 * @author oscar
 */
public class Client  extends Person{
    
    private int phone;

    public Client(int phone, String name, int age) {
        super(name, age);
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
