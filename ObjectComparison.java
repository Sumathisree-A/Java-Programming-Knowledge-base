class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ObjectComparison {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sree");
        Student s2 = new Student(101, "Sree");

        System.out.println(s1 == s2);          // false (different references)
        System.out.println(s1.equals(s2));     // false (default equals does reference comparison)
    }
}
