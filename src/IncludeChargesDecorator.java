/**
 * Created by simonrauch on 20.11.14.
 */
public class IncludeChargesDecorator extends CoRHandlerDecorator{
    public IncludeChargesDecorator(ICoRHandler handlerToBeDecorated) {
        super(handlerToBeDecorated);
    }

    @Override
    public double handleRequest(String variante, double betrag) {
        return (super.handleRequest(variante, betrag))*0.995;
    }
}
