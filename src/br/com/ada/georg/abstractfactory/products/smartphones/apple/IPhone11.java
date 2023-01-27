package br.com.ada.georg.abstractfactory.products.smartphones.apple;

import br.com.ada.georg.abstractfactory.products.smartphones.SmartPhone;

public class IPhone11 implements SmartPhone {
    @Override
    public void showDetails() {
        System.out.println("iPhone 11");
    }
}
