package Lection;

import java.time.Year;
import java.util.Calendar;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public int getYear() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear - this.age);
    }

    public void setAge(int age) {
        if (!(age == 0)) {
            this.age = age;
        }
        System.out.println("Год рождения был изменен");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
        }
        System.out.println("Имя было изменено");
    }

    @Override

    public String toString() {
        return "{" + familyName + " " + name + " " + middleName + " " + age + " }";
    }
}
