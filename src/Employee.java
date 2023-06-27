public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private int phone;
    private String post;

    public Employee(String firstName, String lastName, int age, int salary, int phone, String post) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.post = post;
    }

    public void printEmployee(){                                //форматированный вывод сотрудника
        System.out.println(String.format("FirstName: %s\n" +
                        "LastName: %s\n" +
                        "Post: %s\n" +
                        "Age: %d\n" +
                        "Salary: %d\n" +
                        "Phone: %d\n", firstName, lastName, post, age, salary, phone));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
//    public int compareTo(Employee employee) {             //сортировка без компаратора по возрасту
//        return this.getAge() - employee.getAge();
//    }

    public String toString(){
        return String.format("(%s, %s, %s, %d, %d, %d)",firstName, lastName,post, age, salary, phone);
    }

}
