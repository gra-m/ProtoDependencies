package fun.madeby.protobuf;


import fun.madeby.models.Address;
import fun.madeby.models.Car;
import fun.madeby.models.Person;

/**
 * Created by Gra_m on 2022 04 04
 */

public class _01_CompositionDemo {

    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setNumber(14)
                .setStreet("A street")
                .setCity("Antwerp")
                .setCode("2000")
                .build();

        Car car = Car.newBuilder()
                .setMake("Red Bull")
                .setModel("F1")
                .setYear(2020)
                .setAvMarketValue(300_000_000)
                .build();

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(19)
                .setAddress(address)
                .setCar(car)
                .build();

        System.out.println(sam);

    }
}
