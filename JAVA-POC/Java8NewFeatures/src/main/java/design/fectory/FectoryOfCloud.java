package design.fectory;

public class FectoryOfCloud {

    public Cloud getCloudProvider(String providerName){

        if(providerName.equalsIgnoreCase("AWS")){
            return new AWS();
        }else if(providerName.equalsIgnoreCase("GCP")){
            return new GCP();
        } else if (providerName.equalsIgnoreCase("Azure")) {
            return new Azure();
        }
        return null;
    }

}
