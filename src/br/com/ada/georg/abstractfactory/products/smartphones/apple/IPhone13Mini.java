package br.com.ada.georg.abstractfactory.products.smartphones.apple;

import br.com.ada.georg.abstractfactory.products.smartphones.SmartPhone;

public class IPhone13Mini implements SmartPhone {
    @Override
    public String getDetails() {
        return "iPhone 13 mini";
    }
}
