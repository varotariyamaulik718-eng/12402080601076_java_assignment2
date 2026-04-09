import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Practical3 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        TreeMap<Integer, Student> tmap = new TreeMap<Integer, Student>();

        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");

        list.add(s1);
        list.add(s2);

        map.put(s1.id, s1);
        map.put(s2.id, s2);

        tmap.put(s1.id, s1);
        tmap.put(s2.id, s2);

        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println(map.get(1));
        System.out.println(tmap.get(2));

        for (Student s : list) {
            if (s.id == 2) {
                s.name = "C";
            }
        }

        map.put(2, new Student(2, "C"));
        tmap.put(2, new Student(2, "C"));

        list.removeIf(s -> s.id == 1);
        map.remove(1);
        tmap.remove(1);

        System.out.println(list);
        System.out.println(map);
        System.out.println(tmap);
    }
}
