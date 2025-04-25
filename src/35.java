public class SimpleSchool {
    private String name;
    private int age;

    public SimpleSchool(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void learn() {
        System.out.println("I am a student named " + name + ", and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleSchool school = new SimpleSchool("Alex", 12);
        school.learn();
    }
}
