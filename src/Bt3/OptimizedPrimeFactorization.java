package Bt3;

public class OptimizedPrimeFactorization implements Runnable {
    private int n;

    public OptimizedPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        optimizedPrime(n);
    }

    private void optimizedPrime(int n) {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0 && i != 2) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
