package Week1.Day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fib = 10;
        int fir = 0, sec = 1;
        System.out.println("Fibonacci Series up to " + fib + " terms: ");

        for (int i = 1; i <= fib; i++) {
            System.out.print(fir + " ");   // print in same line
            int next = fir + sec;
            fir = sec;
            sec = next;
        }
    }

	}


