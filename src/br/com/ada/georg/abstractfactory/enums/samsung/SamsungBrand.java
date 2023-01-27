package br.com.ada.georg.abstractfactory.enums.samsung;

import br.com.ada.georg.abstractfactory.enums.Business;

public interface SamsungBrand extends Business {
    String businessName = "Samsung";

    @Override
    default String getBusinessName() {
        return businessName;
    }
}
