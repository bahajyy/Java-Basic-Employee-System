package week2LabÖdev1;

public class Employee {
    int emp_number;
    String name;
    int age;
    String gender;
    int salary;

    public Employee(int emp_number, String name, int age, String gender, int salary) {
        this.emp_number = emp_number;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmp_number() {
        return emp_number;
    }

    public void setEmp_number(int emp_number) {
        this.emp_number = emp_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return emp_number + " " +name+ " " + age+ " " + gender+ " " + salary ;

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
