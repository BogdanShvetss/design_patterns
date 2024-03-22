package chain;

public class FanHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getSubject().contains("gratitude") || email.getContent().contains("Thank you")) {
            System.out.println("Analyzing gratitude");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }
}