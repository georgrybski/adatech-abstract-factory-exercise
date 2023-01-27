package br.com.ada.georg.abstractfactory.enums.apple;

import br.com.ada.georg.abstractfactory.enums.products.SmartPhoneEnum;
import br.com.ada.georg.abstractfactory.factories.smartphones.apple.IPhone13MiniFactory;
import br.com.ada.georg.abstractfactory.factories.smartphones.apple.IPhone11Factory;
import br.com.ada.georg.abstractfactory.factories.smartphones.SmartPhoneFactory;
import br.com.ada.georg.abstractfactory.factories.smartphones.apple.IPhoneXFactory;


public enum AppleSmartPhoneTypes implements AppleBrand, SmartPhoneEnum {
    IPHONE_11(new IPhone11Factory(), "IPhone 11"),
    IPHONE_13_MINI(new IPhone13MiniFactory(), "IPhone 13 Mini"),
    IPHONE_X(new IPhoneXFactory(), "IPhone X");

    private final SmartPhoneFactory FACTORY;
    private final String MODEL_NAME;

    AppleSmartPhoneTypes(SmartPhoneFactory SmartPhoneFactory, String modelName) {
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
