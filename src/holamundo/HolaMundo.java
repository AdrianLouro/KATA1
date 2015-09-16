package holamundo;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class HolaMundo {

    public static void main(String[] args) {             
        Calendar birthday = GregorianCalendar.getInstance();
        birthday.set(1995,7,14);
        
        Person persona = new Person("Adrián", "Louro", birthday);
        
        System.out.println(persona.getFullName() + " tiene " + persona.getAge() + " años.");
    }
}
