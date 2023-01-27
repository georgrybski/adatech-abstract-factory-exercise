package br.com.ada.georg.abstractfactory;

import br.com.ada.georg.abstractfactory.enums.samsung.SamsungLaptopEnum;
import br.com.ada.georg.abstractfactory.enums.samsung.SamsungMonitorEnum;
import br.com.ada.georg.abstractfactory.enums.samsung.SamsungSmartPhoneTypes;
import br.com.ada.georg.abstractfactory.enums.samsung.SamsungBrand;

public class Samsung extends EletronicsManufacturer<SamsungBrand> implements SamsungBrand {
    public Samsung() {
        super(SamsungSmartPhoneTypes.values(), SamsungLaptopEnum.values(), SamsungMonitorEnum.values());
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
