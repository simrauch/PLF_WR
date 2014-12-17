
/**
 * Created by simonrauch on 19.11.14.
 */
public abstract class WR implements IUmrechnen{
    protected CoRHandler han;
    protected double result;

    public WR() {
        han=initializeHandler();
    }

    @Override
    public double umrechnen(String variante, double betrag){
        return han.handleRequest(variante, betrag);
    }

    protected CoRHandler initializeHandler(){
        CoRHandler han1 = new EUR2YENCoRHandler();
        CoRHandler han2 = new EUR2USDCoRHandler();
        han1.setNext(han2);
        return han1;
    }

    protected void setResult(double result){
        this.result=result;
    }
    protected double getResult(){
        return result;
    }

}
