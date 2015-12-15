package ooadStreamboxIteration2;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Colin on 11/12/2015.
 */

public class Registration {
    private Date date;
    private static int registrationID = 0;
    private Member member;

    public Registration(Date date,Member member) {
        this.date = date;
        this.member = member;
        registrationID++;
    }

    public Date getDate() {
        Calendar c = Calendar.getInstance();
        date = c.getTime();
        return date;
    }

    @Override
    public String toString() {
        return "Time and Date of Member Registration is " + getDate()+"\n RegistrationNumber::...." + registrationID +"\n"+ member.toString();
    }
}
