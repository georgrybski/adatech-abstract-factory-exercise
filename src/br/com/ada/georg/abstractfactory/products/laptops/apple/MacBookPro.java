package br.com.ada.georg.abstractfactory.products.laptops.apple;

import br.com.ada.georg.abstractfactory.products.laptops.Laptop;

public class MacBookPro implements Laptop {
    @Override
    public String getDetails() {
        return "MacBook Pro";
    }
}
