/**
 * Created by simonrauch on 19.11.14.
 */
public class EUR2YENCoRHandler extends CoRHandler{
    @Override
    public double handleRequest(String variante, double betrag) {
        if (variante.equals("EUR2YEN")){
            return betrag*147.766283;
        }else{
            return next.handleRequest(variante, betrag);
        }
    }
}
