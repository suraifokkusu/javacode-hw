package task_3;

import java.math.BigInteger;
import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<BigInteger> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    protected BigInteger compute() {
        //факториал 1 или 0 равен 1
        if (number <= 1) {
            return BigInteger.ONE;
        }

        FactorialTask subTask1 = new FactorialTask(number - 1);
        subTask1.fork();

        return BigInteger.valueOf(number).multiply(subTask1.join());
    }
}
