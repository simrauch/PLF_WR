/**
 * Created by simonrauch on 20.11.14.
 */
public class UmrechnenEUR2USDCommand implements ICommand {
    private CoRWR wr;
    private double betrag;
    public UmrechnenEUR2USDCommand(CoRWR wr, double betrag) {
        this.wr = wr;
        this.betrag = betrag;
    }

    @Override
    public void execute() {
        wr.setResult(wr.umrechnen("EUR2USD", betrag));
    }
    public void drawLog() {
        wr.umrechnenWithLog("EUR2USD", betrag);
    }
}
