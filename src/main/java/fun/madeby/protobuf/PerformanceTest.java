package fun.madeby.protobuf;

/**
 * Created by Gra_m on 2022 04 03
 */

public class PerformanceTest {
    public static void main(String[] args) {

        // Json serialize/deserialize
        Runnable runnable1;


        // Protobuf serialize/deserialize
        Runnable runnable2;


    }

    private static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();

        for(int i = 0; i < 1_000_000; i++) {
            runnable.run();
        }

        long time2 = System.currentTimeMillis();

        System.out.println("Method: " + method + " " + (time2 - time1) + " ms");
    }
}
