package Lection;

public class Person {
        private String name;
        private String middleName;
        private String familyName;
        private int age;

    //public static final int Age() {
       // return 1983;
   // }

    public Person (String name, String middleName, String familyName, int age) {
            this.name = name;
            this.middleName = middleName;
            this.familyName = familyName;
            this.age = age;
        }

        public int getAge() {
            return age;
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

public String toString() { return "{"+ familyName + " "+ name +" "+ middleName +" "+age+" }";}
}
