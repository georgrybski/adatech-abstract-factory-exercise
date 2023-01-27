package br.com.ada.georg.abstractfactory.products.laptops.samsung;

import br.com.ada.georg.abstractfactory.products.laptops.Laptop;

public class Odyssey implements Laptop {
    @Override
    public void showDetails() {
        System.out.println("Odyssey");
    }
}
