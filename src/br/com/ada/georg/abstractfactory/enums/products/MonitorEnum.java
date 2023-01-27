package br.com.ada.georg.abstractfactory.enums.products;

import br.com.ada.georg.abstractfactory.enums.ProductEnum;
import br.com.ada.georg.abstractfactory.factories.monitors.MonitorFactory;

public interface MonitorEnum extends ProductEnum {
    MonitorFactory getFactory();
}
