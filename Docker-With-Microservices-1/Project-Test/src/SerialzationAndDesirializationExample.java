import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class SerialzationAndDesirializationExample {
    public static void main(String[] args) {


        Worker worker = new Worker(102, "Prasun Patidar", 27, "Kasrawad");
        try (
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\WorkSpace\\Demo\\Test.ser");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
){
            objectOutputStream.writeObject(worker);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\WorkSpace\\Demo\\Test.ser");

            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);

            Worker worker1= (Worker) objectInputStream.readObject();
            System.out.println(worker1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}


class Worker implements Serializable {
    private transient Integer id;
    private transient static String name;
    private   transient Integer age;
    private String address;


    public Worker(Integer id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

