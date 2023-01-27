package br.com.ada.georg.abstractfactory.enums.samsung;

import br.com.ada.georg.abstractfactory.enums.products.SmartPhoneEnum;
import br.com.ada.georg.abstractfactory.factories.smartphones.SmartPhoneFactory;
import br.com.ada.georg.abstractfactory.factories.smartphones.samsung.GalaxyS20Factory;
import br.com.ada.georg.abstractfactory.factories.smartphones.samsung.GalaxyS22Factory;
import br.com.ada.georg.abstractfactory.factories.smartphones.samsung.GalaxyS8Factory;

public enum SamsungSmartPhoneTypes implements SamsungBrand, SmartPhoneEnum {
    GALAXY_S8(new GalaxyS8Factory(), "Galaxy S8"),
    GALAXY_S20(new GalaxyS20Factory(), "Galaxy S20"),
    GALAXY_S22(new GalaxyS22Factory(), "Galaxy S22");

    private final SmartPhoneFactory FACTORY;
    private final String MODEL_NAME;

    SamsungSmartPhoneTypes(SmartPhoneFactory SmartPhoneFactory, String modelName) {
        FACTORY = SmartPhoneFactory;
        MODEL_NAME = modelName;
    }

    @Override
    public SmartPhoneFactory getFactory() {
        return FACTORY;
    }
    @Override
    public String getProductName() {
        return MODEL_NAME;
    }
}
