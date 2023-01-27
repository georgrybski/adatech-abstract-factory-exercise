package br.com.ada.georg.abstractfactory.enums.apple;

import br.com.ada.georg.abstractfactory.enums.Business;

public interface AppleBrand extends Business {
    String businessName = "Apple";

    @Override
    default String getBusinessName() {
        return businessName;
    }
}
