package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private final static long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getAge() {
        Calendar now = GregorianCalendar.getInstance();
        return (int) (millisecondsToYear(now.getTimeInMillis() - birthday.getTimeInMillis()));
    }

    private long millisecondsToYear(long milliSec) {
        return milliSec / MILLISECONDS_PER_YEAR;
    }
}
