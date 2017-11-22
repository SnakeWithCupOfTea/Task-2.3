package Prog;

public class Tiger  {

    private String  name;
    private int age;

    public Tiger() {

    }

    public void eat() {
        System.out.println("Tiger is eating..");
    }

    public void drink() {
        System.out.println("Tiger is drinking..");
    }

    public void sleep() {
        System.out.println("Tiger is sleeping..");
    }

    public void bored() {
        System.out.println("Tiger is bored..");
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
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
