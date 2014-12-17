/**
 * Created by simonrauch on 20.11.14.
 */
public class LogToCmdDecorator extends CoRHandlerDecorator {
    public LogToCmdDecorator(ICoRHandler handlerToBeDecorated){
        super(handlerToBeDecorated);
    }

    @Override
    public double handleRequest(String variante, double betrag) {
        System.out.println("Umrechnungsvariante: " + variante + " Ursprünglicher Betrag: " + betrag + " Umgerechneter Betrag: " + super.handleRequest(variante, betrag));
        return super.handleRequest(variante, betrag);
    }
}
