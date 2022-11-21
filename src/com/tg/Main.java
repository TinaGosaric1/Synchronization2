package com.tg;

public class Main {
    public static void main(String[] args) {
        Message mes = new Message();
        (new Thread(new Writer(mes))).start();
        (new Thread(new Reader(mes))).start();
    }
}