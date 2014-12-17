/**
 * Created by simonrauch on 19.11.14.
 */
public abstract class CoRHandler implements ICoRHandler{
    protected CoRHandler next;

    public void setNext(CoRHandler han){
        this.next = han;
    }

    public abstract double handleRequest(String variante, double betrag);
}
