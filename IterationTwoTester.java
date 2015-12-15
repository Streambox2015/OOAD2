package ooadStreamboxIteration2;
import java.util.Date;
/**
 * Created by Colin on 12/12/2015.
 */
public class IterationTwoTester {
    public static void main(String[] args) throws InterruptedException {
        AccountType accountType1 = new AccountType(true,false,false);
        AccountType accountType2 = new AccountType(false,true,false);
        AccountType accountType3 = new AccountType(false,false,true);

        Member memberOne = new Member("Colin","Curran","David","Mc","Mahon",accountType1);
        Member memberTwo = new Member("Joe","Joyce","Fight","Me","Boy!!",accountType2);
        Member memberThree = new Member("Pat","O Brien","Fight","Yarlll","Boy!!",accountType3);

        Date date = null;
        Registration registrtion1 = new Registration(date,memberOne);
        System.out.println(registrtion1.toString());

        Registration registration2 = new Registration(date,memberTwo);
        System.out.println(registration2.toString());

        Registration registration3 = new Registration(date,memberThree);
        System.out.println(registration3.toString());
    }

}
