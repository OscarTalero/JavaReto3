package model;

/**
 *
 * @author oscar
 */
public class Employee extends Person {
    
    public int code;
    public  float salary;

    public Employee(int code, float salary, String name, int age) {
        super(name, age);
        this.code = code;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
