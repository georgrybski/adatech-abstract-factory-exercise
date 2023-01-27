package br.com.ada.georg.abstractfactory.factories.smartphones.apple;

import br.com.ada.georg.abstractfactory.factories.smartphones.SmartPhoneFactory;
import br.com.ada.georg.abstractfactory.products.smartphones.apple.IPhoneX;
import br.com.ada.georg.abstractfactory.products.smartphones.SmartPhone;

public class IPhoneXFactory implements SmartPhoneFactory {
    @Override
    public SmartPhone createPhone() {
        return new IPhoneX();
    }
}
