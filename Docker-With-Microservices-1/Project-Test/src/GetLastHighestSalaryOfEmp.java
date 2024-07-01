import java.util.*;
import java.util.stream.Collectors;

public class GetLastHighestSalaryOfEmp {

    public static void main(String[] args) {


        List<Emp> list = getEmps();

        System.out.println(list.stream().collect(Collectors.groupingBy(Emp::getSalary, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)), Optional::get)))



        );
        System.out.println("-----------------------------------------------------");

        System.out.println( list.stream().mapToDouble(e->e.getSalary()).summaryStatistics().getMax());
        System.out.println("-----------------------------------------------------");
        System.out.println(list.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).distinct().skip(1).findFirst());
    }





    public static List<Emp> getEmps() {


        return Arrays.asList(
                new Emp(101, "prasun", "kasrawad", 10.50, "dev"),
                new Emp(101, "kamal", "kasrawad", 11.50, "dev"),
                new Emp(101, "rekha", "kasrawad", 12.50, "dev"),
                new Emp(101, "chandan", "kasrawad", 13.50, "dev"),
                new Emp(101, "megha", "kasrawad", 14.50, "dev"),
                new Emp(101, "jyoti", "kasrawad", 15.50, "dev"),
                new Emp(101, "abhi", "kasrawad", 16.50, "dev"),
                new Emp(101, "priya", "kasrawad", 17.50, "dev"),
                new Emp(101, "kali", "kasrawad", 19.50, "dev"),
                new Emp(101, "ram", "kasrawad", 20.50, "dev"),
                new Emp(101, "shiv", "kasrawad", 20.50, "dev")
        );
    }

}


class Emp {

    private Integer id;
    private String name;
    private String address;
    private Double salary;
    private String dept;

    public Emp(Integer id, String name, String address, Double salary, String dept) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}


