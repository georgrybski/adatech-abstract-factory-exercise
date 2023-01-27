package br.com.ada.georg.abstractfactory.factories.monitors.samsung;

import br.com.ada.georg.abstractfactory.factories.monitors.MonitorFactory;
import br.com.ada.georg.abstractfactory.products.monitors.Monitor;
import br.com.ada.georg.abstractfactory.products.monitors.samsung.OdysseyG5;

public class OdysseyG5Factory implements MonitorFactory {
    @Override
    public Monitor createMonitor() {
        return new OdysseyG5();
    }
}
