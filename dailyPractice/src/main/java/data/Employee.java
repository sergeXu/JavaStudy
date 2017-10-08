package data;

import java.util.Date;

public class Employee {
    private String name;
    private double salery;
    private Date hireDay;

    public Employee(String name, double salery, Date hireDay) {
        this.name = name;
        this.salery = salery;
        this.hireDay = hireDay;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }
}
