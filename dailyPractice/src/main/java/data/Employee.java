package data;
//4-1
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salery;
    private Date hireDay;

    public Employee(String name, double salery, Date hireDay) {
        this.name = name;
        this.salery = salery;
        this.hireDay = hireDay;
    }
    public Employee(String name, double salery,int year,int month,int day) {
        this.name = name;
        this.salery = salery;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }
    public Employee() {
    }

    public void raiseSalary(double byPercent){
        Double raisedSalery = this.salery * byPercent / 100.0;
        this.salery = this.salery + raisedSalery;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salery=" + salery +
                ", hireDay=" + hireDay +
                '}';
    }
}
