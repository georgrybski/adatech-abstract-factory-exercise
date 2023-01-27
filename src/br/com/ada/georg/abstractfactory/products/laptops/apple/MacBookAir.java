package br.com.ada.georg.abstractfactory.products.laptops.apple;

import br.com.ada.georg.abstractfactory.products.laptops.Laptop;

public class MacBookAir implements Laptop {
    @Override
    public void showDetails() {
        System.out.println("MacBook Air");
    }
}
