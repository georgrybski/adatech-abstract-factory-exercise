package br.com.ada.georg.abstractfactory.products.monitors.apple;

import br.com.ada.georg.abstractfactory.products.monitors.Monitor;

public class AppleStudioDisplay implements Monitor {
    @Override
    public void showDetails() {
        System.out.println("Apple Studio Display");
    }
}
