/**
 * Created by simonrauch on 19.11.14.
 */
public class EUR2USDCoRHandler extends CoRHandler{
    @Override
    public double handleRequest(String variante, double betrag) {
        if (variante.equals("EUR2USD")){
            return betrag*1.25412;
        }else{
            return next.handleRequest(variante, betrag);
        }
    }
}