class PrimeThread extends Thread {
    private int start, end;

    PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " - " + Thread.currentThread().getName());
            }
        }
    }
}

public class Practical1 {
    public static void main(String[] args) {
        PrimeThread t1 = new PrimeThread(1, 50);
        PrimeThread t2 = new PrimeThread(51, 100);
        t1.start();
        t2.start();
    }
}
