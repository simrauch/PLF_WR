import java.util.ArrayList;

/**
 * Created by simonrauch on 27.11.14.
 */
public class CommandComposite implements ICommand {

    private ArrayList<ICommand> comp;
    private String name;

    public CommandComposite(String name) {
        comp = new ArrayList<ICommand>();
        this.name = name;
    }
    public void addComponent(ICommand comp){
        this.comp.add(comp);
    }
    public void removeComponent(ICommand comp){
        this.comp.remove(comp);
    }
    @Override
    public void drawLog() {
        System.out.println("#### " + name + " ####");
        for(ICommand x: comp){
            x.drawLog();
        }
        System.out.print("");
    }

    @Override
    public void execute() {
        System.out.println("Composites können nicht ausgeführt werden.");
    }
}
