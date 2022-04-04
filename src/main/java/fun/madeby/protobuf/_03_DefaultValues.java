package fun.madeby.protobuf;

import fun.madeby.models.Person;

/**
 * Created by Gra_m on 2022 04 04
 */

public class _03_DefaultValues {
    public static void main(String[] args) {
        Person person = Person.newBuilder().build();

        System.out.println("Person city: " + person.getAddress().getCity());
        System.out.println("Person number: " + person.getAddress().getNumber());

        /* check has actual initialised values only for nested objects not Scalar
        where default.
       */

        System.out.println(person.hasAddress());
    }
}
