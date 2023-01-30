package br.com.ada.georg.abstractfactory.products.monitors.samsung;

import br.com.ada.georg.abstractfactory.products.monitors.Monitor;

public class OdysseyG5 implements Monitor {
    @Override
    public String getDetails() {
        return "Odyssey G5";
    }
}
