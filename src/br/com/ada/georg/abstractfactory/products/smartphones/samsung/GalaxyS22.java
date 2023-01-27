package br.com.ada.georg.abstractfactory.products.smartphones.samsung;

import br.com.ada.georg.abstractfactory.products.smartphones.SmartPhone;

public class GalaxyS22 implements SmartPhone {
    @Override
    public void showDetails() {
        System.out.println("Galaxy S22");
    }
}
