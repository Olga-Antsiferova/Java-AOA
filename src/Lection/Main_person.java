package Lection;

public class Main_person {
    public static void main(String[] args) {

        String name = "Ivan";
        String middleName = "Petrovich";
        String familyName = "Sidorov";
        int age = 18;

        Person person = new Person(name, middleName, familyName, age);
        System.out.println("Первоначальное имя = " + person.getName());
        person.setName("Федор");
        System.out.println("Измененное имя = " + person.getName());
        System.out.println("Год рождения = " + person.getYear());
        person.setAge(19);
        System.out.println("Год рождения измененный = " + person.getYear());
        System.out.println(person);
    }
}
