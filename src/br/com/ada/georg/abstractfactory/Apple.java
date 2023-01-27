package br.com.ada.georg.abstractfactory;

import br.com.ada.georg.abstractfactory.enums.apple.AppleLaptopEnum;
import br.com.ada.georg.abstractfactory.enums.apple.AppleMonitorEnum;
import br.com.ada.georg.abstractfactory.enums.apple.AppleSmartPhoneTypes;
import br.com.ada.georg.abstractfactory.enums.apple.AppleBrand;

public class Apple extends EletronicsManufacturer<AppleBrand> implements AppleBrand {
    public Apple() {
        super(AppleSmartPhoneTypes.values(), AppleLaptopEnum.values(), AppleMonitorEnum.values());
    }

    @Override
    public void listAllLaptops() {
        System.out.println(getBusinessName() + " laptops:");
        super.listAllLaptops();
    }

    @Override
    public void listAllMonitors() {
        System.out.println(getBusinessName() + " monitors:");
        super.listAllMonitors();
    }

    @Override
    public void listAllSmartPhones() {
        System.out.println(getBusinessName() + " smartphones:");
        super.listAllSmartPhones();
    }

    public void listAllProducts() {
        System.out.println("Apple products:");
        listAllLaptops();
        listAllMonitors();
        listAllSmartPhones();
    }
}
