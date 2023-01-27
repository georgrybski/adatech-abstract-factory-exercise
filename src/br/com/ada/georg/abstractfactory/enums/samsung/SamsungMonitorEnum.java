package br.com.ada.georg.abstractfactory.enums.samsung;

import br.com.ada.georg.abstractfactory.enums.products.MonitorEnum;
import br.com.ada.georg.abstractfactory.factories.monitors.MonitorFactory;
import br.com.ada.georg.abstractfactory.factories.monitors.samsung.OdysseyG5Factory;

public enum SamsungMonitorEnum implements SamsungBrand, MonitorEnum {
    ODYSSEY_G5(new OdysseyG5Factory(), "Odyssey G5");

    private final MonitorFactory FACTORY;
    private final String MODEL_NAME;

    SamsungMonitorEnum(MonitorFactory FACTORY, String MODEL_NAME) {
        this.FACTORY = FACTORY;
        this.MODEL_NAME = MODEL_NAME;
    }

    @Override
    public MonitorFactory getFactory() {
        return FACTORY;
    }
    @Override
    public String getProductName() {
        return MODEL_NAME;
    }
}
