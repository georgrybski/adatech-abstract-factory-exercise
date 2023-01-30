package br.com.ada.georg.abstractfactory;

import br.com.ada.georg.abstractfactory.enums.apple.AppleLaptopEnum;
import br.com.ada.georg.abstractfactory.enums.apple.AppleMonitorEnum;
import br.com.ada.georg.abstractfactory.enums.apple.AppleSmartPhoneTypes;
import br.com.ada.georg.abstractfactory.enums.apple.AppleBrand;

public class Apple extends EletronicsManufacturer implements AppleBrand {
    public Apple() {
        super(AppleSmartPhoneTypes.values(), AppleLaptopEnum.values(), AppleMonitorEnum.values());
    }
}
