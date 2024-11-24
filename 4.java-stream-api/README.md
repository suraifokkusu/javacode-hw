# Практические задания по Stream API

## Задание 1: **Stream API - Генерация чисел**
Предположим, у нас есть список заказов, где каждый заказ содержит продукт и его стоимость. Требуется:
- Создать список заказов с разными продуктами и их стоимостью.
- Группировать заказы по продуктам.
- Найти общую стоимость всех заказов для каждого продукта.
- Отсортировать продукты по убыванию общей стоимости.
- Выбрать три самых дорогих продукта.
- Вывести список трёх самых дорогих продуктов и их общую стоимость.

**Исходный код:**
```java
class Order {
    private String product;
    private double cost;

    public Order(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }
}

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Laptop", 1200.0),
            new Order("Smartphone", 800.0),
            new Order("Laptop", 1500.0),
            new Order("Tablet", 500.0),
            new Order("Smartphone", 900.0)
        );
    }
}
```

---

## Задание 2: **Stream API - Агрегация и объединение результатов**
 - Создайте коллекцию студентов, где каждый студент содержит информацию о предметах, которые он изучает, и его оценках по этим предметам.
 - Используйте Parallel Stream для обработки данных и создания Map, где ключ — предмет, а значение — средняя оценка по всем студентам.
 - Выведите результат: общую Map со средними оценками по всем предметам.

**Исходный код:**
```java
class Student {
    private String name;
    private Map<String, Integer> grades;

    public Student(String name, Map<String, Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
}
```

---

## Задание 3: **Stream API - ForkJoinPool: Рекурсивное вычисление факториала**
 Рассмотрим задачу вычисления факториала числа с использованием ForkJoinPool. Факториал числа n обозначается как n! и вычисляется как произведение всех положительных целых чисел от 1 до n.
 - Реализуйте класс FactorialTask, который расширяет RecursiveTask. Этот класс будет выполнять рекурсивное вычисление факториала числа.
 - В конструкторе FactorialTask передайте число n, факториал которого нужно вычислить.
 - В методе compute() разбейте задачу на подзадачи и используйте fork() для их асинхронного выполнения.
 - Используйте join() для получения результатов подзадач и комбинирования их для получения общего результата.
 - В основном методе создайте экземпляр FactorialTask с числом, для которого нужно вычислить факториал, и запустите его в ForkJoinPool.
 - Выведите результат вычисления факториала.

**Пример кода:**
```java
public class ForkJoinPoolExample {
    public static void main(String[] args) {
        int n = 10; // Вычисление факториала для числа 10

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FactorialTask factorialTask = new FactorialTask(n);

        long result = forkJoinPool.invoke(factorialTask);

        System.out.println("Факториал " + n + "! = " + result);
    }
}
```
