package chain;

public class SpamHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getContent().matches("ads|ad|bargains")) {
            System.out.println("Deleting email");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }
}