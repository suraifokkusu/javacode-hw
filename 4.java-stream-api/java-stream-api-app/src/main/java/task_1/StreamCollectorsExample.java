package task_1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectorsExample {
    public static void main(String[] args) {

        // Список заказов
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0),
                new Order("Headphones", 200.0),
                new Order("Smartwatch", 300.0),
                new Order("Laptop", 1300.0),
                new Order("Tablet", 700.0),
                new Order("Smartphone", 850.0),
                new Order("Headphones", 250.0),
                new Order("Blender", 400)
        );
        System.out.println("///////////////// [Задание №1.] /////////////////");

        System.out.println("///////////////// [Список заказов.] /////////////////");
        for (Order elem:orders){
            System.out.println(elem.toString());
        }

        System.out.println("///////////////// [Группировать заказы по продуктам + общая стоимость.] /////////////////");
        Map<String, Double> groupOrders = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getProduct, //группируем по названию
                        Collectors.summingDouble(Order::getCost) //суммируем по стоимости
                ));
        for (Map.Entry<String,Double> entry:groupOrders.entrySet()){
            System.out.println(entry.toString());
        }

        System.out.println("///////////////// [Отсортировать продукты по убыванию общей стоимости.] /////////////////");
        List<Map.Entry<String,Double>> sortedOrders = groupOrders.entrySet().stream()
                        .sorted((order1, order2) -> Double.compare(order2.getValue(), order1.getValue()))
                        .collect(Collectors.toList());
        for (Map.Entry<String,Double> entry: sortedOrders){
            System.out.println(entry.toString());
        }
        System.out.println("///////////////// [Выбрать три самых дорогих продукта и вывести список трёх самых дорогих продуктов.] /////////////////");
        sortedOrders.stream()
                        .limit(3)
                .map(entry-> "product: "+ entry.getKey())
                .forEach(System.out::println);

        List<Map.Entry<String,Double>> top3Product = sortedOrders.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("List");
        for (Map.Entry<String,Double> entry: top3Product){
            System.out.println(entry.toString());
        }
    }
}
