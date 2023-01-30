package br.com.ada.georg.abstractfactory.products.laptops.apple;

import br.com.ada.georg.abstractfactory.products.laptops.Laptop;

public class MacBookAir implements Laptop {
    @Override
    public String getDetails() {
        return "MacBook Air";
    }
}
