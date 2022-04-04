package fun.madeby.protobuf;

import fun.madeby.models.Car;
import fun.madeby.models.Dealer;

/**
 * Created by Gra_m on 2022 04 04
 */

public class _02_MapDemo {
    public static void main(String[] args) {

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
                .setBodyStyleValue(1)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2020, f1)
                .putModel(1914, prius)
                .build();

        System.out.println(dealer.getModelCount());
        System.out.println(dealer.getModelOrDefault(2020, f1));
        System.out.println(dealer.getModelOrThrow(2020).getBodyStyle());
        System.out.println(dealer.getModelOrThrow(1914).getBodyStyle());
    }

}
