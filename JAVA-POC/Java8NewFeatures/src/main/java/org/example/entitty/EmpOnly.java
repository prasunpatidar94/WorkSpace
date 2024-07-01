package org.example.entitty;

public class EmpOnly {


    private String name;
    private Double salary;
    private String age;
    private String dept;

    public EmpOnly(String name, Double salary, String age, String dept) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmpOnly{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", age='" + age + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
