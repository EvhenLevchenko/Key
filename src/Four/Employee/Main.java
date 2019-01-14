package Four.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Bob Bentley", 20000, 2010, 12, 15);
        staff[1] = new Employee("Ben", 15000, 2015, 10, 10);
        staff[2] = new Employee("John", 10000, 2018, 8, 5);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        //  for (Employee e:staff) {
        //       System.out.println(e.toString());
        //   }

        for (Employee e : staff)
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", hireDay= " + e.getHireDay());


    }
}
