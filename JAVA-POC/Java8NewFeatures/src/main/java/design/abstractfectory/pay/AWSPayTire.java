package design.abstractfectory.pay;

import design.abstractfectory.Cloud;

public class AWSPayTire implements Cloud {

    @Override
    public void printNameOfCloud() {
        System.out.println("This is ths pay Tire AWS Cloud...!!!");
    }
}
