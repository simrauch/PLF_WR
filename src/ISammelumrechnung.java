/**
 * Created by simonrauch on 19.11.14.
 */
public interface ISammelumrechnung {
    public double sammelumrechnen(String variante, double[] betraege);
    public double sammelumrechnenWithLog(String variante, double[] betraege);
    public double sammelumrechnenWithCharges(String variante, double[] betraege);
    public double sammelumrechnenWithChargesAndLog(String variante, double[] betraege);
}
