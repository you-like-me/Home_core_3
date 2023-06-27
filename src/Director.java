public class Director extends Employee{
    public Director(String firstName, String lastName, int age, int salary, int phone, String post) {
        super(firstName, lastName, age, salary, phone, post);
    }

    public static void salaryUpDefault(Employee[] employees){   //метод повышения ЗП с Default значениями
        salaryUp(employees, 45, 5000);
    }
    public static void salaryUp(Employee[] employees, int age, int upSalary){   //метод повышения ЗП
        for(int i = 0; i < employees.length; i++){
            if(employees[i].getAge() > age){
                employees[i].setSalary(employees[i].getSalary() + upSalary);
            }
        }
    }
}
