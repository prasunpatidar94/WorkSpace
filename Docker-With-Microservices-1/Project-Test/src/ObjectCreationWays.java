import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationWays {
    public static void main(String[] args) {
//        Class classObj=  Class.forName("StudentForObjectCreationWays");
//
//
//        StudentForObjectCreationWays s=  (StudentForObjectCreationWays) classObj.newInstance();
//        System.out.println(s);


        Constructor<StudentForObjectCreationWays> constructor;

        {
            try {


                constructor = StudentForObjectCreationWays.class.getConstructor();
                StudentForObjectCreationWays s = constructor.newInstance();
                System.out.println(s.getId());
                System.out.println(s);

            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }


    }
}


 class StudentForObjectCreationWays {

    private Integer id = 101;
    private String Name = "Prasun";

    private String show(){
        return "This is private method  and access by reflection api in java ";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "StudentForObjectCreationWays{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}


