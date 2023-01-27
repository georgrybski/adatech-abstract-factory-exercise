package br.com.ada.georg.abstractfactory.util;

import br.com.ada.georg.abstractfactory.enums.ProductEnum;

import java.util.Arrays;
import java.util.HashMap;
public class HashMapInitializer {
    public static <T extends ProductEnum> HashMap<String, T> initializeProductEnumHashMap(T[] productEnumArray) {
        HashMap<String, T> productEnumHashMap = new HashMap<>();
        Arrays.stream(productEnumArray).forEach(productEnum -> productEnumHashMap.put(productEnum.getProductName(), productEnum));
        return productEnumHashMap;
    }
}
