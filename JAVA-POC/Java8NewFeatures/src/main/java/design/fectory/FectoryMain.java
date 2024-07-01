package design.fectory;

public class FectoryMain {

    public static void main(String[] args) {

        FectoryOfCloud fectoryOfCloud = new FectoryOfCloud();
        Cloud cloudAzure = fectoryOfCloud.getCloudProvider("Azure");
        Cloud cloudGCP = fectoryOfCloud.getCloudProvider("GCP");
        Cloud cloudAWS = fectoryOfCloud.getCloudProvider("AWS");

        cloudAzure.printNameOfCloud();
        cloudGCP.printNameOfCloud();
        cloudAWS.printNameOfCloud();

    }
}
