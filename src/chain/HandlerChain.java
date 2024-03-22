package chain;

public interface HandlerChain {
    void setNext(HandlerChain handlerChain);

    void handleRequest(Email email);
}