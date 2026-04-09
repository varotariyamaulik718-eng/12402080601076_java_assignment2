class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws Exception {
        while (available) {
            wait();
        }

        data = value;
        System.out.println("Produced: " + value);
        available = true;

        notify();
    }

    synchronized void consume() throws Exception {
        while (!available) {
            wait();
        }

        System.out.println("Consumed: " + data);
        available = false;

        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        int i = 1;
        try {
            while (true) {
                b.produce(i++);
                sleep(500);
            }
        } catch (Exception e) {}
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        try {
            while (true) {
                b.consume();
                sleep(800);
            }
        } catch (Exception e) {}
    }
}

public class Practical2 {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
