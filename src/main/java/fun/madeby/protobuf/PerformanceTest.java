package fun.madeby.protobuf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import fun.madeby.models.Person;
import fun.madeby.models.json.JPerson;


/**
 * Created by Gra_m on 2022 04 03
 */

public class PerformanceTest {
    public static void main(String[] args) {

        // Json serialize/deserialize
        JPerson person = new JPerson();
        person.setName("sam");
        person.setAge(10);
        ObjectMapper mapper = new ObjectMapper();

        Runnable runnable1 = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch(Exception e) {
                e.printStackTrace();
            }
        };

        // Protobuf serialize/deserialize
        Person person1 = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        Runnable runnable2 = () -> {

                try {
                    byte[] bytes = person1.toByteArray();
                    Person person2 = Person.parseFrom(bytes);
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
        };


        for (int i =0; i < 5; i++) {
            runPerformanceTest(runnable1, "JSON");
            runPerformanceTest(runnable2, "ProtoBuf");
        }





    }

    private static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();

        for(int i = 0; i < 5_000_000; i++) {
            runnable.run();
        }

        long time2 = System.currentTimeMillis();

        System.out.println("Method: " + method + " " + (time2 - time1) + " ms");
    }
}
