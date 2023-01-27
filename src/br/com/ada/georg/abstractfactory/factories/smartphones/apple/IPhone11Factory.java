package br.com.ada.georg.abstractfactory.factories.smartphones.apple;

import br.com.ada.georg.abstractfactory.factories.smartphones.SmartPhoneFactory;
import br.com.ada.georg.abstractfactory.products.smartphones.apple.IPhone11;
import br.com.ada.georg.abstractfactory.products.smartphones.SmartPhone;

public class IPhone11Factory implements SmartPhoneFactory {
    @Override
    public SmartPhone createPhone() {
        return new IPhone11();
    }
}
