package br.com.ada.georg.abstractfactory.products.laptops.samsung;

import br.com.ada.georg.abstractfactory.products.laptops.Laptop;

public class Odyssey implements Laptop {
    @Override
    public String getDetails() {
        return "Odyssey";
    }
}
