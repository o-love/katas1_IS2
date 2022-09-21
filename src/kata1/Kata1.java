package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2002, Month.JUNE,1);

        Person person = new Person("Oscar", birthday);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}