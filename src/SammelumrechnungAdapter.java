/**
 * Created by simonrauch on 21.11.14.
 */
public class SammelumrechnungAdapter implements ISammelumrechnung {
    private CoRHandler han;
    private CoRWR wr;

    public SammelumrechnungAdapter() {
        wr = new CoRWR();
        han = wr.initializeHandler();
    }

    @Override
    public double sammelumrechnen(String variante, double[] betraege) {
        double result=0;
        int i = 0;
        for(double x: betraege){
            result = result + wr.umrechnen(variante, x);
            i++;
        }
        return result;
    }

    @Override
    public double sammelumrechnenWithLog(String variante, double[] betraege) {
        double result = 0;
        int i = 0;
        for(double x: betraege){
            result = result + wr.umrechnenWithLog(variante, x);
            i++;
        }
        return result;
    }

    @Override
    public double sammelumrechnenWithCharges(String variante, double[] betraege) {
        double result = 0;
        int i = 0;
        for(double x: betraege){
            result = result + wr.umrechnenWithCharges(variante, x);
            i++;
        }
        return result;
    }

    @Override
    public double sammelumrechnenWithChargesAndLog(String variante, double[] betraege) {
        double result = 0;
        int i = 0;
        for(double x: betraege){
            result = result + wr.umrechnenWithChargesAndLog(variante, x);
            i++;
        }
        return result;
    }

}
