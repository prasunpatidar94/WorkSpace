package design.abstractfectory;
public class AbstarctFectoryMainClass {
    public static void main(String[] args) {

        AbstractFectory abstractFectory = AbstractFectoryProvider.getAbstractFectory("PAY");
        Cloud cloud = abstractFectory.getCloudProvider("GCP");

        cloud.printNameOfCloud();
    }
}
