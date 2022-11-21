package com.tg;

import java.util.Random;

public class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()){
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000)); //pause for a random period of time, but no more than 2 seconds
            } catch(InterruptedException e) {

            }
        }
    }
}
