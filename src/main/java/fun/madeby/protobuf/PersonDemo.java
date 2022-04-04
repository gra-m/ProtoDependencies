package fun.madeby.protobuf;


import com.google.protobuf.Int32Value;
import fun.madeby.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Gra_m on 2022 03 30
 */

public class PersonDemo {
    public static void main(String[] args) throws IOException {
       Person sam = Person.newBuilder()
               .setName("sam")
               // no autoboxing but now Person.hasAge() is available
               .setAge(Int32Value.newBuilder().setValue(10).build())
               .build();

        System.out.println("Original\n" + sam);

       // Create serialized person
       Path path = Paths.get("Person.ser");
       Files.write(path, sam.toByteArray());

       // Retrieve serialized person
       byte[] retrievedByteArray = Files.readAllBytes(path);
       Person newSam = Person.parseFrom(retrievedByteArray);

       System.out.println("Retrieved\n" + newSam);





    }
}
