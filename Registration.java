package ooadStreamboxIteration3;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Colin on 11/12/2015.
 */

public class Registration {
    private Date date;
    public static int nextRegistrationID = 0;// change back to private
    private int registrationID;
    private Member member;

    public Registration(Date date,Member member) {
        this.date = date;
        this.member = member;
        nextRegistrationID++;
        registrationID = nextRegistrationID;
    }

    public Date getDate() {
        Calendar dateAndTime = Calendar.getInstance();
        date = dateAndTime.getTime();
        return date;
    }

    @Override
    public String toString() {
        return "Time and Date of Member Registration is " + getDate()
                +"\n Registration Number::...."
                + registrationID +"\n"
                + member.toString();
    }
}
