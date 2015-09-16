package holamundo;

import java.util.Date;


public class HolaMundo {

    public static void main(String[] args) {
        Person p1 = new Person("Adrián", "Louro", new Date(95,7,14));
        System.out.println(p1.getFullName() + " tiene " + p1.getAge() + " años.");
    }
}
