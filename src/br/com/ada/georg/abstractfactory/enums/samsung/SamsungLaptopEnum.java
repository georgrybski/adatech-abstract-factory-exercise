package br.com.ada.georg.abstractfactory.enums.samsung;

import br.com.ada.georg.abstractfactory.enums.products.LaptopEnum;
import br.com.ada.georg.abstractfactory.factories.laptops.LaptopFactory;
import br.com.ada.georg.abstractfactory.factories.laptops.samsung.GalaxyBook2Factory;
import br.com.ada.georg.abstractfactory.factories.laptops.samsung.OdysseyFactory;

public enum SamsungLaptopEnum implements SamsungBrand, LaptopEnum {
    GALAXY_BOOK_2(new GalaxyBook2Factory(), "Galaxy Book 2"),
    ODYSSEY(new OdysseyFactory(), "Odyssey");

    private final LaptopFactory FACTORY;
    private final String MODEL_NAME;

    SamsungLaptopEnum(LaptopFactory factory, String modelName) {
        FACTORY = factory;
        MODEL_NAME = modelName;
    }

    @Override
    public String getProductName() {
        return MODEL_NAME;
    }

    @Override
    public LaptopFactory getFactory() {
        return FACTORY;
    }
}
