package br.com.ada.georg.abstractfactory;

import br.com.ada.georg.abstractfactory.enums.Business;
import br.com.ada.georg.abstractfactory.enums.products.LaptopEnum;
import br.com.ada.georg.abstractfactory.enums.products.MonitorEnum;
import br.com.ada.georg.abstractfactory.enums.products.SmartPhoneEnum;
import br.com.ada.georg.abstractfactory.products.laptops.Laptop;
import br.com.ada.georg.abstractfactory.products.monitors.Monitor;
import br.com.ada.georg.abstractfactory.products.smartphones.SmartPhone;
import br.com.ada.georg.abstractfactory.util.HashMapInitializer;

import java.util.HashMap;

public abstract class EletronicsManufacturer<T extends Business>{
    protected HashMap<String, SmartPhoneEnum> smarphoneTypesHashMap;
    protected HashMap<String, LaptopEnum> laptopTypesHashMap;
    protected HashMap<String, MonitorEnum> monitorTypesHashMap;

    public EletronicsManufacturer(SmartPhoneEnum[] smarphoneTypes, LaptopEnum[] laptopTypes, MonitorEnum[] monitorTypes) {
        this.smarphoneTypesHashMap = HashMapInitializer.initializeProductEnumHashMap(smarphoneTypes);
        this.laptopTypesHashMap = HashMapInitializer.initializeProductEnumHashMap(laptopTypes);
        this.monitorTypesHashMap = HashMapInitializer.initializeProductEnumHashMap(monitorTypes);
    }

    public void listAllSmartPhones() {
        smarphoneTypesHashMap.values()
                .stream()
                .map(this::assembleSmartPhone)
                .forEach(SmartPhone::showDetails);
    }

    public void listAllLaptops() {
        laptopTypesHashMap.values()
                .stream()
                .map(this::assembleLaptop)
                .forEach(Laptop::showDetails);
    }

    public void listAllMonitors() {
        monitorTypesHashMap.values()
                .stream()
                .map(this::assembleMonitor)
                .forEach(Monitor::showDetails);
    }

    public void listAllProducts() {
        listAllSmartPhones();
        listAllLaptops();
        listAllMonitors();
    }

    public SmartPhone assembleSmartPhone(String model){
        return assembleSmartPhone(smarphoneTypesHashMap.get(model));
    }

    public Laptop assembleLaptop(String model){
        return assembleLaptop(laptopTypesHashMap.get(model));
    }

    public Monitor assembleMonitor(String model){
        return assembleMonitor(monitorTypesHashMap.get(model));
    }

    private  <S extends SmartPhoneEnum> SmartPhone assembleSmartPhone(S smartPhoneTypeEnum) {
        return smartPhoneTypeEnum.getFactory().createPhone();
    }

    private  <U extends LaptopEnum> Laptop assembleLaptop(U laptopTypeEnum) {
        return laptopTypeEnum.getFactory().createLaptop();
    }

    private <V extends MonitorEnum> Monitor assembleMonitor(V monitorTypeEnum) {
        return monitorTypeEnum.getFactory().createMonitor();
    }
}

