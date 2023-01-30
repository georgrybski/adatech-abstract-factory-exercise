package br.com.ada.georg.abstractfactory.products.laptops.samsung;

import br.com.ada.georg.abstractfactory.products.laptops.Laptop;

public class GalaxyBook2 implements Laptop {
    @Override
    public String getDetails() {
        return "Galaxy Book 2";
    }
}
