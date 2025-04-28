import java.util.Scanner;

class FibonacciGenerator implements Runnable {
    private int limit;

    public FibonacciGenerator(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci numbers up to " + limit + ":");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class EvenNumberPrinter implements Runnable {
    private int start, end;

    public EvenNumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start value for even numbers: ");
        int start = scanner.nextInt();

        System.out.print("Enter end value for even numbers: ");
        int end = scanner.nextInt();

        System.out.print("Enter limit for Fibonacci numbers: ");
        int fibLimit = scanner.nextInt();

        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(fibLimit);
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter(start, end);

        Thread fibonacciThread = new Thread(fibonacciGenerator);
        Thread evenNumberThread = new Thread(evenNumberPrinter);

        fibonacciThread.start();
        evenNumberThread.start();

        try {
            fibonacciThread.join();
            evenNumberThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        scanner.close();
    }
}
