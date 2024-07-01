package design.abstractfectory;

public class AbstractFectoryProvider {

    public static AbstractFectory getAbstractFectory(String tire){

        if (tire.equalsIgnoreCase("FREE")) {
            return new FectoryOfCloudForFree();

        } else if (tire.equalsIgnoreCase("PAY")) {
            return new FectoryOfCloudForPay();

        }
        return null;
    }
}
