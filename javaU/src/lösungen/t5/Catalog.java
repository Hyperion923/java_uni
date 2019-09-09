package lösungen.t5;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.deleteProduct("se");
        catalog.updateProduct("pikachu", 200);
        System.out.println(catalog.getProductPrice("pikachu"));
        System.out.println(catalog.catalog);
    }

    private Map<String, Integer> catalog = new HashMap<>();


    void addProduct(String product, int price) {
        if (!hasProduct(product)) {
            catalog.put(product, price);
        } else
            System.out.println(product + "already exist");
    }

    void updateProduct(String product, int price) {
        if (hasProduct(product)) {
            catalog.replace(product, price);
        } else throwError(product);
    }

    void deleteProduct(String product) {
        if (hasProduct(product)) {
            catalog.remove(product);
        } else {
            throwError(product);
        }
    }

    void showProduct(String product) {
        if (hasProduct(product)) {
            int euroCent = catalog.get(product);
            int cent = euroCent % 100;
            String centValue = String.valueOf(cent);
            if (centValue.length() == 1) {
                centValue = "0" + centValue;
            }
            System.out.println(product + ": " + (euroCent / 100) + "," + centValue + "€");

        } else throwError(product);
    }

    int getProductPrice(String product) {
        return catalog.get(product);
    }

    void throwError(String product) {
        System.out.println(product + "does not exist");
    }

    boolean hasProduct(String product) {
        return catalog.containsKey(product);
    }
}

