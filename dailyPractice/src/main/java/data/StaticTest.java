package data;
//4-3
public class StaticTest {
    public static void main(String[] args) {
        Employee2[] staff = new Employee2[3];
        staff[0] = new Employee2("serge",999.2);
        staff[1] = new Employee2("Tom",22.2);
        staff[2] = new Employee2("trace",54);

        for(Employee2 e : staff){
            e.setId();
        }
        for(Employee2 e : staff){
            System.out.println(e);
        }
    }

}
class Employee2{
    private static long nextId =136772;
    private String name;
    private long id;
    private double salery;

    public Employee2(String name, double salery) {
        this.name = name;
        this.salery = salery;
    }

    public static long getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public double getSalery() {
        return salery;
    }

    public void setId() {
        this.id = nextId;
        nextId += 1;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salery=" + salery +
                '}';
    }
    //for unit test
    public static void main(String[] args) {
        Employee2 e = new Employee2("testName",999.6);
        System.out.println(e.getName()+" "+e.getSalery());
    }
}
