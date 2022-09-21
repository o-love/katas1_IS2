package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {
    public static void main(String[] args) {
        Calendar birthday = GregorianCalendar.getInstance();
        birthday.set(2002, Calendar.JUNE, 1);

        Person person = new Person("Oscar", birthday);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}