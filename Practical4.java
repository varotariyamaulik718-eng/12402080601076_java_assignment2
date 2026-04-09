import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book implements Comparable<Book> {
    int id;
    String name;
    double price;

    Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int compareTo(Book b) {
        return this.name.compareTo(b.name);
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

class PriceComparator implements Comparator<Book> {
    public int compare(Book a, Book b) {
        if (a.price > b.price) return 1;
        if (a.price < b.price) return -1;
        return 0;
    }
}

public class Practical4 {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<Book>();

        list.add(new Book(1, "Java", 500));
        list.add(new Book(2, "Python", 300));
        list.add(new Book(3, "C++", 400));

        Collections.sort(list);

        for (Book b : list) {
            System.out.println(b);
        }

        Collections.sort(list, new PriceComparator());

        for (Book b : list) {
            System.out.println(b);
        }
    }
}
