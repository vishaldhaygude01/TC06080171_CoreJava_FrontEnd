package Ass;

public abstract class Processor {
    int n;

    abstract void process();

    void showData() {
        System.out.println("n: " + n);
    }
}

class Factorial extends Processor {
	
    Factorial(int number) {
        n = number;
    }

    @Override
    void process() {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
