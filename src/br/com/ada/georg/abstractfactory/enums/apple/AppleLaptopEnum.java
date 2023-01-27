package br.com.ada.georg.abstractfactory.enums.apple;

import br.com.ada.georg.abstractfactory.enums.products.LaptopEnum;
import br.com.ada.georg.abstractfactory.enums.samsung.SamsungBrand;
import br.com.ada.georg.abstractfactory.factories.laptops.LaptopFactory;
import br.com.ada.georg.abstractfactory.factories.laptops.apple.MacBookAirFactory;
import br.com.ada.georg.abstractfactory.factories.laptops.apple.MacBookProFactory;

public enum AppleLaptopEnum implements SamsungBrand, LaptopEnum {
    MACBOOK_AIR(new MacBookAirFactory(), "MacBook Air"),
    MACBOOK_PRO(new MacBookProFactory(), "MacBook Pro");

    private final LaptopFactory FACTORY;
    private final String MODEL_NAME;

    AppleLaptopEnum(LaptopFactory factory, String modelName) {
        FACTORY = factory;
        MODEL_NAME = modelName;
    }

    @Override
    public LaptopFactory getFactory() {
        return FACTORY;
    }

    @Override
    public String getProductName() {
        return MODEL_NAME;
    }
}
