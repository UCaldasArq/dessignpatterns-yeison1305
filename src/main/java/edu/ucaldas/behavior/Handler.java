package edu.ucaldas.behavior;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    public abstract String handleRequest(String request);
}
