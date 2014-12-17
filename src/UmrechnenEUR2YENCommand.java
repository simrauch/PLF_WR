/**
 * Created by simonrauch on 21.11.14.
 */
public class UmrechnenEUR2YENCommand implements ICommand {
    private CoRWR wr;
    private double betrag;
    public UmrechnenEUR2YENCommand(CoRWR wr, double betrag) {
        this.wr = wr;
        this.betrag = betrag;
    }

    @Override
    public void execute() {
        wr.setResult(wr.umrechnen("EUR2YEN", betrag));
    }
    public void drawLog() {
        wr.umrechnenWithLog("EUR2YEN", betrag);
    }
}