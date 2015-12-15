package ooadStreamboxIteration1;
import java.util.Date;

/**
 * Created by Colin on 11/12/2015.
 */
public class MemberRegistrationTest {
    public static void main(String[] args) throws InterruptedException {

        Member memberOne = new Member("Colin","Curran","David","Mc","Mahon");
        Member memberTwo = new Member("Joe","Joyce","Fight","Me","Boy!!");
        Date date = null;

        Registration rr = new Registration(date,memberOne);
        System.out.println(rr.toString());

        System.out.println("PENDING");
        Thread.sleep(10000);

        Registration rr2 = new Registration(date,memberOne);
        System.out.println(rr2.toString());

        System.out.println("PENDING");
        Thread.sleep(1000);

        Registration rr3 = new Registration(date,memberTwo);
        System.out.println(rr3.toString());
    }
}
