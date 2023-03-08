package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class VerificationScheduler {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        List<User> listOfResgisteredUsers = new ArrayList<>();
        User client = new User();
        client.setEmail("gadibiao@decagonhq.com");
        client.setFullName("Gadibia Oghenetevwodaro");
        User client1 = new User();
        client1.setEmail("ibiao@decagonhq.com");
        client1.setFullName("ibia Oghenetevwo");
        User client2 = new User();
        client2.setEmail("gadibia@decagonhq.com");
        client2.setFullName("Gadibia Daro");
        client2.setVerificationStatus(User.Status.ONE);
        User client3 = new User();
        client3.setEmail("Idibiao@decagonhq.com");
        client3.setFullName("Idibia Odaro");
        listOfResgisteredUsers.add(client);
        listOfResgisteredUsers.add(client1);
        listOfResgisteredUsers.add(client2);
        listOfResgisteredUsers.add(client3);



        //LOOP FOR SCHEDULEDEXECUTRORSERVICE...
        for (int i = 0; i < listOfResgisteredUsers.size(); i++) {
            final int finalI = i;
            scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                if (listOfResgisteredUsers.get(finalI)!=null
                        && listOfResgisteredUsers.get(finalI).getVerificationStatus()
                                .equals(User.Status.ZERO)){

                    System.out.println("Hi there "+
                            listOfResgisteredUsers.get(finalI).getFullName() +
                            ", please hurry up and get your email verified so you can enjoy the multitude of services we offer!");
                }
            }
        }, finalI, TimeUnit.SECONDS);

        }

        scheduledExecutorService.shutdown();



    }
}
