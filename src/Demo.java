/**
 * Created by simonrauch on 19.11.14.
 */
public class Demo {
    public static void main(String[] args) {
        KOOOT;
        testCoR();
        testDecorator();
        testCommand();
        testAdapter();
        testComposite();
    }

    public static void testCoR(){
        System.out.println("Testing Chain of Responsibility:");
        CoRWR wr = new CoRWR();

        System.out.println(wr.umrechnen("EUR2USD", 30));
        System.out.println(wr.umrechnen("EUR2YEN", 30));
        System.out.println("");
        System.out.println("------------------------------------------------");


    }
    public static void testDecorator(){
        System.out.println("Testing Decorator:");
        CoRWR wr = new CoRWR();

        System.out.println(wr.umrechnenWithCharges("EUR2USD", 30));
        wr.umrechnenWithLog("EUR2USD", 30);
        wr.umrechnenWithChargesAndLog("EUR2USD", 30);
        System.out.println("");
        System.out.println("------------------------------------------------");
    }
    public static void testCommand(){
        System.out.println("Testing Command:");
        CoRWR wr = new CoRWR();

        Invoker inv = new Invoker();
        ICommand com = new UmrechnenEUR2USDCommand(wr, 30);
        ICommand com1 = new UmrechnenEUR2YENCommand(wr, 5625);
        ICommand com2 = new UmrechnenEUR2USDCommand(wr, 5235243);

        inv.saveCommand(com);
        inv.activate();
        System.out.println(wr.getResult());
        inv.saveCommand(com1);
        inv.activate();
        System.out.println("");
        System.out.println("Testing undo/redo:");
        System.out.println(wr.getResult());
        inv.undo();
        System.out.println(wr.getResult());
        inv.redo();
        System.out.println(wr.getResult());
        inv.saveCommand(com2);
        inv.activate();
        System.out.println(wr.getResult());
        inv.undo();
        System.out.println(wr.getResult());
        inv.undo();
        System.out.println(wr.getResult());
        inv.redo();
        System.out.println(wr.getResult());
        System.out.println("");
        System.out.println("Testing Log:");
        inv.drawLog();
        System.out.println("");
        System.out.println("------------------------------------------------");
    }
    public static void testAdapter(){
        System.out.println("Testing Adapter:");
        ISammelumrechnung su = new SammelumrechnungAdapter();
        double[] betraege = new double[]{13254.43,634,363.46,4533.57,663446,34523,34.45};
        System.out.println(su.sammelumrechnen("EUR2USD", betraege));
        System.out.println(su.sammelumrechnenWithCharges("EUR2USD", betraege));
        System.out.println("");
        System.out.println("------------------------------------------------");
    }
    public static void testComposite(){
        System.out.println("Testing Composite:");

        CoRWR wr = new CoRWR();
        Invoker inv = new Invoker();
        ICommand com = new UmrechnenEUR2USDCommand(wr, 30);
        ICommand com1 = new UmrechnenEUR2YENCommand(wr, 5625);
        ICommand com2 = new UmrechnenEUR2USDCommand(wr, 5235243);
        inv.compositeNewMonth("Januar");
        inv.addToThisMonth(com);
        inv.addToThisMonth(com1);
        inv.compositeNewMonth("Februar");
        inv.addToThisMonth(com2);
        inv.drawSaved();

        System.out.println("");
        System.out.println("------------------------------------------------");
    }
}
