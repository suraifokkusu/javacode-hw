package task_3;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolExample {
    public static void main(String[] args) {
        System.out.println("///////////////// [Задание №3.] /////////////////");
        int number = 21;
        System.out.println("Число, для которого вычисляем факториал: " + number);

        //управление многопоточкой
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        //"строительный блок"
        FactorialTask factorialTask = new FactorialTask(number);

        //запускаем задачу и получаем результат
        BigInteger result = forkJoinPool.invoke(factorialTask);

        System.out.println("Факториал " + number + "! = " + result);
    }
}
