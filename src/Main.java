import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivanov", "Alex", 41, 1000, 7409, "Manager");
        Director employee2 = new Director("Voronov", "Oleg", 38, 5000, 2015, "Director");
        Employee employee3 = new Employee("Sergeev", "Arsen", 47, 2000, 3580, "Manager");
        Employee employee4 = new Employee("Mitin", "Lev", 52, 800, 6980, "Manager");
        Employee employee5 = new Employee("Orlova", "Anna", 25, 900, 1570, "Secretary");
        Employee employee6 = new Employee("Semenova", "Olga", 33, 500, 5320, "Accountant");

    Employee[] employees = new Employee[] {employee1, employee2, employee3, employee4, employee5, employee6};

//    for(Employee employee:employees){ //для вывода первоначальных параметров
//        employee.printEmployee();
//    }
    for(int i = 0; i < employees.length; i++){              //проверка на принадлежность классу Director
        if(employees[i] instanceof Director){
            Director.salaryUp(new Employee[]{employees[i]}, 0, 0);}
        else{                                               //повышение ЗП всем сотрудникам,кроме директора
            Director.salaryUp(new Employee[]{employees[i]}, 0, 3000);
        }
    }

    for(Employee employee:employees){               //вывод результата после повышения ЗП всем, кроме директора
        employee.printEmployee();
    }

    Arrays.sort(employees, new EmployeeSalaryComparator());         //сортировка компоратором по ЗП
        System.out.println("After sorting by Salary:" + Arrays.toString(employees));

    Arrays.sort(employees, new EmployeeAgeComparator());            //сортировка компоратором по возрасту
        System.out.println("After sorting by Age:" + Arrays.toString(employees));
}
}