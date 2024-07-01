package design.abstractfectory;

import design.abstractfectory.pay.AWSPayTire;
import design.abstractfectory.pay.GCPPayTire;

public class FectoryOfCloudForPay extends AbstractFectory {

    @Override
    public Cloud getCloudProvider(String providerName) {

        if (providerName.equalsIgnoreCase("AWS")) {
            return new AWSPayTire();
        } else if (providerName.equalsIgnoreCase("GCP")) {
            return new GCPPayTire();
        }
        return null;
    }

}
