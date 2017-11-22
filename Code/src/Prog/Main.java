//Создать класс Зоопарк (поля Тигр, Лев, Жираф) Создать классы Тигр,
// Лев, Жираф с полями кличка, возраст и методами Есть() Пить() Спать() Скучать()
//В главном классе создать по одному Тигру, Льву и Жирафу и
// поместить их в Зоопарк используя сеттеры класса Зоопарк.
//Вывести на экран содержимое зоопарка, переопределив метод toString() для класса Зоопарк

package Prog;

public class Main {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.setName("Jimmy");
        tiger.setAge(3);

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Roxy");
        giraffe.setAge(14);


        Lion lion = new Lion();
        lion.setName("LeoNard");
        lion.setAge(6);

        Zoo zoo = new Zoo();
        zoo.setTiger(tiger);
        zoo.setLion(lion);
        zoo.setGiraffe(giraffe);

        System.out.println(zoo);
    }
}
