package design.singaltone;

public class SingaltonClass {

    private static SingaltonClass object = null;

    private SingaltonClass() {
    }

    public static  SingaltonClass getObjectOfClass(){

        if (object==null){
            synchronized(SingaltonClass.class){
                if (object==null){
                   object= new SingaltonClass();

                }
            }
        }

        return object;
    }

}
