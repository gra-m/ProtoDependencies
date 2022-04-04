package fun.madeby.protobuf;

import fun.madeby.models.Credentials;
import fun.madeby.models.EmailCredentials;
import fun.madeby.models.PhoneOTP;

/**
 * Created by Gra_m on 2022 04 04
 */

public class OneOfDemo {
    public static void main(String[] args) {
        EmailCredentials emailLogin = EmailCredentials.newBuilder()
                .setEmail("This@email.com")
                .setPassword("Password123")
                .build();

        PhoneOTP phoneLogin = PhoneOTP.newBuilder()
                .setNumber(12334124)
                .setCode(23445632)
                .build();


        Credentials credentials = Credentials.newBuilder()
                .setPhoneDingleberry(phoneLogin)
                //.setEmailDingleberry(emailLogin)
                .build();

        login(credentials);

    }


    public static void login(Credentials credentials) {

        switch(credentials.getDingleberryCase()) {
            case EMAILDINGLEBERRY: {
                System.out.println(credentials.getEmailDingleberry());
                break;
            }
            case PHONEDINGLEBERRY: {
                System.out.println(credentials.getPhoneDingleberry());
                break;
            }
            case DINGLEBERRY_NOT_SET: {
                throw new RuntimeException("Dingleberry for login not set");
            }
        }
    }
}
