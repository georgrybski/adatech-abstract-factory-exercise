package br.com.ada.georg.abstractfactory.factories.laptops.apple;

import br.com.ada.georg.abstractfactory.factories.laptops.LaptopFactory;
import br.com.ada.georg.abstractfactory.products.laptops.Laptop;
import br.com.ada.georg.abstractfactory.products.laptops.apple.MacBookPro;

public class MacBookProFactory implements LaptopFactory {
    @Override
    public Laptop createLaptop() {
        return new MacBookPro();
    }
}
