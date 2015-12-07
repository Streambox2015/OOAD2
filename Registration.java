package Streambox;

/**
 * Created by t00058011 on 07/12/2015.
 */
public class Registration extends Member {
    private long registrationTime;

    public Registration(String Username, String Forename, String Surname, String Email, String Password, long registrationTime) {
        super(Username, Forename, Surname, Email, Password);
        setRegistrationTime(registrationTime);
    }


    public void setRegistrationTime(long registrationTime) {
        this.registrationTime = registrationTime;
    }


    public long getRegistrationTime(){
        return registrationTime;
    }


    public String toString(){
        return super.toString()+"\nTime registered...."+getRegistrationTime();
    }
}
