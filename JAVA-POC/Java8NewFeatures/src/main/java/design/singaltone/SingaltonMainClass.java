package design.singaltone;

public class SingaltonMainClass {

    public static void main(String[] args) {
        SingaltonClass singaltonClass1 = SingaltonClass.getObjectOfClass();
        System.out.println(singaltonClass1.hashCode());
        SingaltonClass singaltonClass2 = SingaltonClass.getObjectOfClass();
        System.out.println(singaltonClass2.hashCode());
        SingaltonClass singaltonClass3 = SingaltonClass.getObjectOfClass();
        System.out.println(singaltonClass3.hashCode());
    }
}
