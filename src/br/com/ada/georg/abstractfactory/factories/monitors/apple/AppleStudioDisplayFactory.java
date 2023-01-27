package br.com.ada.georg.abstractfactory.factories.monitors.apple;

import br.com.ada.georg.abstractfactory.factories.monitors.MonitorFactory;
import br.com.ada.georg.abstractfactory.products.monitors.Monitor;
import br.com.ada.georg.abstractfactory.products.monitors.apple.AppleStudioDisplay;

public class AppleStudioDisplayFactory implements MonitorFactory {

    @Override
    public Monitor createMonitor() {
        return new AppleStudioDisplay();
    }
}
