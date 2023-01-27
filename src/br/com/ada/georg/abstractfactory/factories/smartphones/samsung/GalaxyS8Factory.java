package br.com.ada.georg.abstractfactory.factories.smartphones.samsung;

import br.com.ada.georg.abstractfactory.factories.smartphones.SmartPhoneFactory;
import br.com.ada.georg.abstractfactory.products.smartphones.SmartPhone;
import br.com.ada.georg.abstractfactory.products.smartphones.samsung.GalaxyS8;

public class GalaxyS8Factory implements SmartPhoneFactory {
    @Override
    public SmartPhone createPhone() {
        return new GalaxyS8();
    }
}
