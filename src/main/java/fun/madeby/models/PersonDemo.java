package fun.madeby.models;

/**
 * Created by Gra_m on 2022 03 30
 */

public class PersonDemo {
    public static void main(String[] args) {
       Person sam = Person.newBuilder()
               .setName("sam")
               .setAge(10)
               .build();

        System.out.println(sam);

    }
}
