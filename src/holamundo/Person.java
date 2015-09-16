package holamundo;

import java.util.Date;


public class Person {

    private final String name;
    private final String surname;
    private final Date birthday;

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
    
    public int getAge(){
        return (int) (((new Date()).getTime()-birthday.getTime()) / (1000*60*60*24*365.25));
    }
    
}