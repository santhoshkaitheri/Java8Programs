public class StreamAPI {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Skv", 30);
        Employee employee2 = new Employee("Pvs", 70);
        Employee employee3 = new Employee("Akb", 25);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        int maxAge = employeeList.stream().maptoInt(e->Employee::getAge).max();
         System.out.println("Max Age :" + maxAge);

        System.out.println("Name Starts with S :" + employeeList.stream().filter(e->e.getName().startsWith("S")));
    }
}