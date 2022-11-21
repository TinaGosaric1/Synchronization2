package com.tg;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Prvo sporocilo",
                "Drugo sporocilo",
                "Tretje sporocilo",
                "Cetrto sporocilo"
        };

        Random random = new Random(); // for a random delay

        for(int i=0; i<messages.length; i++){
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}
