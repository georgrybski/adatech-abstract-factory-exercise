package br.com.ada.georg.abstractfactory.enums.products;

import br.com.ada.georg.abstractfactory.enums.ProductEnum;
import br.com.ada.georg.abstractfactory.factories.laptops.LaptopFactory;

public interface LaptopEnum extends ProductEnum {
    LaptopFactory getFactory();
}
