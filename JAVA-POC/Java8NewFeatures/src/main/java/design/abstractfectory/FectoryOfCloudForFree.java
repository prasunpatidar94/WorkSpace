package design.abstractfectory;


import design.abstractfectory.free.AWSFreeTire;
import design.abstractfectory.free.GCPFreeTire;

public class FectoryOfCloudForFree extends AbstractFectory   {

@Override
    public Cloud getCloudProvider(String providerName){

        if(providerName.equalsIgnoreCase("AWS")){
            return new AWSFreeTire();
        }else if(providerName.equalsIgnoreCase("GCP")){
            return new GCPFreeTire();
        }
        return null;
    }


}
