package br.com.ada.georg.abstractfactory.factories.laptops.samsung;

import br.com.ada.georg.abstractfactory.factories.laptops.LaptopFactory;
import br.com.ada.georg.abstractfactory.products.laptops.Laptop;
import br.com.ada.georg.abstractfactory.products.laptops.samsung.GalaxyBook2;

public class GalaxyBook2Factory implements LaptopFactory {
    @Override
    public Laptop createLaptop() {
        return new GalaxyBook2();
    }
}
