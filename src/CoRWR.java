/**
 * Created by simonrauch on 19.11.14.
 */
public class CoRWR extends WR{

    public CoRWR() {
    }

    public double umrechnenWithCharges(String variante, double betrag){
        return new IncludeChargesDecorator(han).handleRequest(variante, betrag);
    }

    public double umrechnenWithLog(String variante, double betrag){
        return new LogToCmdDecorator(han).handleRequest(variante, betrag);
    }

    public double umrechnenWithChargesAndLog(String variante, double betrag){
        return new LogToCmdDecorator(new IncludeChargesDecorator(han)).handleRequest(variante, betrag);
    }

}
