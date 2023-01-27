package br.com.ada.georg.abstractfactory.enums.apple;

import br.com.ada.georg.abstractfactory.enums.products.MonitorEnum;
import br.com.ada.georg.abstractfactory.factories.monitors.MonitorFactory;
import br.com.ada.georg.abstractfactory.factories.monitors.apple.AppleStudioDisplayFactory;

public enum AppleMonitorEnum implements AppleBrand, MonitorEnum {
    APPLE_STUDIO_DISPLAY_FACTORY(new AppleStudioDisplayFactory(), "Apple Studio Display");

    private final MonitorFactory FACTORY;
    private final String MODEL_NAME;

    AppleMonitorEnum(MonitorFactory factory, String modelName) {
        FACTORY = factory;
        MODEL_NAME = modelName;
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
