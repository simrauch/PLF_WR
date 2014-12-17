/**
 * Created by simonrauch on 20.11.14.
 */
public abstract class CoRHandlerDecorator implements ICoRHandler {
    private ICoRHandler handlerToBeDecorated;

    public CoRHandlerDecorator(ICoRHandler handlerToBeDecorated) {
        this.handlerToBeDecorated = handlerToBeDecorated;
    }

    @Override
    public double handleRequest(String variante, double betrag) {
        return handlerToBeDecorated.handleRequest(variante, betrag);
    }
}
