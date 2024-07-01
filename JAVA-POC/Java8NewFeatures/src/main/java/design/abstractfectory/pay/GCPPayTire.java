package design.abstractfectory.pay;

import design.abstractfectory.Cloud;

public class GCPPayTire implements Cloud {

    @Override
    public void printNameOfCloud() {
        System.out.println("This is ths Pay Tire  GCP Cloud...!!!");
    }
}
