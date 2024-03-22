package chain;

public class EmailFilter {
    private final HandlerChain handlerChain;

    public EmailFilter() {
        HandlerChain spamChain = new SpamHandler();
        HandlerChain fanChain = new FanHandler();
        HandlerChain complaintChain = new ComplaintHandler();
        HandlerChain newLocChain = new NewLocHandler();

        spamChain.setNext(fanChain);
        fanChain.setNext(complaintChain);
        complaintChain.setNext(newLocChain);

        handlerChain = spamChain;
    }

    public void filtering(Email email) {
        handlerChain.handleRequest(email);
    }
}