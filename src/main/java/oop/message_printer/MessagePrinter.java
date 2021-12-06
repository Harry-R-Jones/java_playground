package oop.message_printer;

public class MessagePrinter {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println(message);
    }
}
