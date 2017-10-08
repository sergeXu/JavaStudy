package data;
//4-2
public class EmployeeTest {
    //main function could be used for unit testing in the class
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("serge",888.7,1987,12,15);
        staff[1] = new Employee("wuyi",333,2001,11,1);
        staff[2] = new Employee("zhangyang",25.2,1999,11,19);

        for(Employee e:staff){
            e.raiseSalary(10);
        }

        for(Employee e:staff){
            System.out.println(e);
        }
    }
}



