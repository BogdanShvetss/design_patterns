package chain;

public class NewLocHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getSubject().contains("installation")) {
            System.out.println("Sending the email to the department of commercial development");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }
}