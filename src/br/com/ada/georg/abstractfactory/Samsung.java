package br.com.ada.georg.abstractfactory;

import br.com.ada.georg.abstractfactory.enums.samsung.SamsungLaptopEnum;
import br.com.ada.georg.abstractfactory.enums.samsung.SamsungMonitorEnum;
import br.com.ada.georg.abstractfactory.enums.samsung.SamsungSmartPhoneTypes;
import br.com.ada.georg.abstractfactory.enums.samsung.SamsungBrand;
public class Samsung extends EletronicsManufacturer implements SamsungBrand {
    public Samsung() {
        super(SamsungSmartPhoneTypes.values(), SamsungLaptopEnum.values(), SamsungMonitorEnum.values());
    }
}
