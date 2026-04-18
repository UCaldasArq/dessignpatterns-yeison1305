package edu.ucaldas.structural;

public class EmailNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "Email enviado: " + message;
    }
}

