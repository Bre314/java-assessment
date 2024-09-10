package org.humanity.client;


import org.humanity.Food;
import org.humanity.Person;
import org.humanity.VegetarianException;

import java.time.LocalDate;

public class PersonClient {
    // provide name, and birthdate values as constructor argument and call toString() on each printing the returned string from each call use the following
//Jay 12/5/1966, Katheryn 7/26/1977, Craig 11/5/1950

    public static void main(String[] args)  {
        Person p1 = new Person("Jay", LocalDate.of(1966,12,5));
        //Person p2 = new Person("Katheryn", LocalDate.of(1977,7,26));
        Person p3 = new Person("Craig", LocalDate.of(1950,11,5));

        System.out.println(p1);
        //System.out.println(p2);
        System.out.println(p3);

        p1.eat();
        //p1.eat(Food.SALAD);

        Person p2 = new Person("Kathryn" , LocalDate.of(1977,7,26), true);
        System.out.println(p2);

        try {
            p2.eat(Food.SALAD);
            p2.eat(Food.CHICKEN);
            p2.eat(Food.NUTS);
        } catch (VegetarianException e) {
            System.out.println("Exception caught " + e.getMessage());
        }

        System.out.println(p1.getName() +  " is " + p1.getAge() + " years old.");
    }

}
