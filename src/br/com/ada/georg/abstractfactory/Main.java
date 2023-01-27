package br.com.ada.georg.abstractfactory;

public class Main {
    public static void main(String[] args) {
        var samsung = new Samsung();
        var apple = new Apple();

        apple.listAllProducts();
        samsung.listAllProducts();
    }
}