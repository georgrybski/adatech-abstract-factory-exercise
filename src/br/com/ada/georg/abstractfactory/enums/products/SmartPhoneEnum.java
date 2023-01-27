package br.com.ada.georg.abstractfactory.enums.products;

import br.com.ada.georg.abstractfactory.enums.ProductEnum;
import br.com.ada.georg.abstractfactory.factories.smartphones.SmartPhoneFactory;

public interface SmartPhoneEnum extends ProductEnum {
    SmartPhoneFactory getFactory();
}
