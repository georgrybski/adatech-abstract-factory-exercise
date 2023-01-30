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

public abstract class EletronicsManufacturer<T extends Business> implements Business{
    protected HashMap<String, SmartPhoneEnum> smarphoneTypesHashMap;
    protected HashMap<String, LaptopEnum> laptopTypesHashMap;
    protected HashMap<String, MonitorEnum> monitorTypesHashMap;
    protected String businessName;

    public EletronicsManufacturer(SmartPhoneEnum[] smarphoneTypes, LaptopEnum[] laptopTypes, MonitorEnum[] monitorTypes) {
        this.smarphoneTypesHashMap = HashMapInitializer.initializeProductEnumHashMap(smarphoneTypes);
        this.laptopTypesHashMap = HashMapInitializer.initializeProductEnumHashMap(laptopTypes);
        this.monitorTypesHashMap = HashMapInitializer.initializeProductEnumHashMap(monitorTypes);
        businessName = this.getBusinessName();
    }

    public void listAllSmartPhones() {
        smarphoneTypesHashMap.values()
                .stream()
                .map(this::assembleSmartPhone)
                .map(SmartPhone::getDetails)
                .forEach(System.out::println);
    }

    public void listAllLaptops() {
        laptopTypesHashMap.values()
                .stream()
                .map(this::assembleLaptop)
                .map(Laptop::getDetails)
                .forEach(System.out::println);
    }

    public void listAllMonitors() {
        monitorTypesHashMap.values()
                .stream()
                .map(this::assembleMonitor)
                .map(Monitor::getDetails)
                .forEach(System.out::println);
    }

    public void listAllProducts() {
        System.out.println(businessName + " products:");
        listAllSmartPhones();
        listAllLaptops();
        listAllMonitors();
        System.out.println();
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

    public   <S extends SmartPhoneEnum> SmartPhone assembleSmartPhone(S smartPhoneTypeEnum) {
            return smartPhoneTypeEnum.getFactory().createPhone();
    }

    public  <U extends LaptopEnum> Laptop assembleLaptop(U laptopTypeEnum) {
        return laptopTypeEnum.getFactory().createLaptop();
    }

    public  <V extends MonitorEnum> Monitor assembleMonitor(V monitorTypeEnum) {
        return monitorTypeEnum.getFactory().createMonitor();
    }
}

