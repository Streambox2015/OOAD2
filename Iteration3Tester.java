package ooadStreamboxIteration3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Colin on 13/12/2015.
 */

public class Iteration3Tester {
    public static void main(String[] args) throws InterruptedException {

        AccountType accountType1 = new AccountType(true,false,false);
        AccountType accountType2 = new AccountType(false,true,false);
        AccountType accountType3 = new AccountType(false,false,true);

        Member memberOne = new Member("Dave86","dsd43f","David","McMahon","maccy82@gmail.com",accountType1);
        Member memberTwo = new Member("Joe55","hryd3s","Joe","Joyce","joycie@yahoo.com!!",accountType2);
        Member memberThree = new Member("Pat66","ldk21dd","Pat","O'Brien","pobrien@eircom.net!!",accountType3);
        Date date = null;

        Registration registration1 = new Registration(date,memberOne);
        Registration registration2 = new Registration(date,memberTwo);
        Registration registration3 = new Registration(date,memberThree);

        List <Registration> registeredMembersList = new ArrayList();

        registeredMembersList.add(registration1);
        registeredMembersList.add(registration2);
        registeredMembersList.add(registration3);

        for(Registration registeredMembers: registeredMembersList){
            System.out.println(registeredMembers);
        }
    }
}
