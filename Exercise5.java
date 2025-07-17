    // : Create an class called Employee
    class  Employee{
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
        public String getDetails() {
            return "Name:  " + name + ",  Salary:  " + salary;

        }
    }

    // : Create a class Manager that:
    class Manager extends Employee
    {
        
        private String department;

        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        @Override
        public String getDetails() {
            return super.getDetails() + ", Department: " + department;  
        }
    }
    // - Extends Employee



    public class Exercise5 {
        public static void main(String[] args) {
            //  Create Employee and Manager objects
            Employee obj = new Employee("Alice" , 50000.0);
            Employee Man = new Manager("Bob", 80000.0, "IT");
            //  Print their details using getDetails()
            System.out.println(obj.getDetails());
            System.out.println();
            System.out.println(Man.getDetails());

        }
    }
    

