package test2.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String dept;
    private String name;

    private List<Employee> subordinates;

    public Employee(String dept, String name) {
        this.dept = dept;
        this.name = name;
        this.subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public  void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept +"]");
    }
}
