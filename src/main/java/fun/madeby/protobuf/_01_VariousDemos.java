package fun.madeby.protobuf;


import fun.madeby.models.Address;
import fun.madeby.models.Car;
import fun.madeby.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gra_m on 2022 04 04
 */

public class _01_VariousDemos {

    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setNumber(14)
                .setStreet("A street")
                .setCity("Antwerp")
                .setCode("2000")
                .build();

        Car f1 = Car.newBuilder()
                .setMake("Red Bull")
                .setModel("F1")
                .setYear(2020)
                .setAvMarketValue(300_000_000)
                .build();
        Car prius = Car.newBuilder()
                .setMake("Toyota")
                .setModel("Cooper")
                .setYear(1914)
                .setAvMarketValue(18.67)
                .build();

        List<Car> carList = new ArrayList<>();
        carList.add(f1);
        carList.add(prius);

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(19)
                .setAddress(address)
                .addAllCar(carList)
                .build();

        System.out.println(sam);

    }
}
