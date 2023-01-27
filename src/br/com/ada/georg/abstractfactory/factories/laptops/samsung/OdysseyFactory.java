package br.com.ada.georg.abstractfactory.factories.laptops.samsung;

import br.com.ada.georg.abstractfactory.factories.laptops.LaptopFactory;
import br.com.ada.georg.abstractfactory.products.laptops.Laptop;
import br.com.ada.georg.abstractfactory.products.laptops.samsung.Odyssey;

public class OdysseyFactory implements LaptopFactory {
    @Override
    public Laptop createLaptop() {
        return new Odyssey();
    }
}
