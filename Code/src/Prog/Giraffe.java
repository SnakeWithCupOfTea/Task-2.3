package Prog;

public class Giraffe {

    private String  name;
    private int age;

    public Giraffe() {
    }

    public void eat() {
        System.out.println("Girraff is eating..");
    }

    public void drink() {
        System.out.println("Giraffe is drinking..");
    }

    public void sleep() {
        System.out.println("Giraffe is sleeping..");
    }

    public void bored() {
        System.out.println("Giraffe is bored..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
