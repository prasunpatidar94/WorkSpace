package design.abstractfectory.free;

import design.abstractfectory.Cloud;

public class AWSFreeTire implements Cloud {

    @Override
    public void printNameOfCloud() {
        System.out.println("This is ths Free Tire AWS Cloud...!!!");
    }
}
