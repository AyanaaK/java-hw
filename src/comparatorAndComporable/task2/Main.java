package comparatorAndComporable.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Телефоны", "Iphone 15", 999));
        products.add(new Product("Ноутбуки", "Macbook Air", 1999));
        products.add(new Product("Телефоны", "Samsung Galaxy A5", 999));
        products.add(new Product("Кондиционеры", "LG P09ED", 1440));
        products.add(new Product("Фотоаппараты", "Instax mini", 400));

        // 1) Сортировка по стоимости товаров в порядке убывания.

//        Collections.sort(products, new CostDecendingComparator());

//        2) Сортировка по категориям в порядке возрастания, при одинаковых
//        категориях необходимо сортировать по стоимости в порядке убывания.

//        Collections.sort(products, new CategoryAscendingCostDescendingComparator());

//        3) Сортировка по категориям в порядке возрастания, при одинаковых
//         категориях необходимо сортировать по стоимости в порядке убывания,
//         если стоимость товаров так же идентичная, сортировать по названия
//         товара в порядке возрастания.

        Collections.sort(products, new CatAscCostDescNameAscComparator());


        for (Product product : products) {
            System.out.println(product);
        }
    }
}
