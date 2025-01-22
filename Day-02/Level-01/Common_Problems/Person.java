public class Person {
    public String name;
    public int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

   // @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1); // Clone person1

        System.out.println(p1); // output- Person{name='Alice', age=25}
        System.out.println(p2); // output-: Person{name='Alice', age=25}
    }
}
