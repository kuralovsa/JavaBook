import java.util.Scanner;

public class Interface_example {
    private static WhatsApp whatsApp;
    private static Telegram telegram;

    private static void SendMessage() {
        telegram.SendMessage();
        whatsApp.SendMessage();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please change Messenger" + "\nTelegram;" + "\nWhatsApp;");
        String n = sc.nextLine();
        switch (n) {
            case "Telegram":
                Telegram tg = new Telegram();
                tg.SendMessage();
                tg.getMessage();
                break;
            case "WhatsApp":
                WhatsApp wa = new WhatsApp();
                wa.SendMessage();
                wa.getMessage();
                break;
            default:
                throw new IllegalStateException("It's code haven't messenger with name: " + n);
        }
    }

    interface Messenger {
        public void SendMessage();

        public void getMessage();
    }

    static class WhatsApp implements Messenger {

        @Override
        public void SendMessage() {
            System.out.println("Send message by WhatApp");
        }

        @Override
        public void getMessage() {
            System.out.println("Read the message in 'WhatsApp' ");
        }
    }

    static class Telegram implements Messenger {

        @Override
        public void SendMessage() {
            System.out.println("Send message by 'Telegram'");
        }

        @Override
        public void getMessage() {
            System.out.println("Read the message in 'Telegram' ");
        }
    }
}