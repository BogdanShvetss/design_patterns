package chain;

public class ComplaintHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getSubject().contains("Complaint")) {
            System.out.println("Analyzing complaint");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }
}