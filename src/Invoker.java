import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by simonrauch on 20.11.14.
 */
public class Invoker {
    ICommand command;
    Stack<ICommand> redolog= new Stack<ICommand>();
    Stack<ICommand> undolog=new Stack<ICommand>();
    ArrayList<ICommand> log=new ArrayList<ICommand>();
    CommandComposite saved;
    CommandComposite current;

    public Invoker() {
        saved = new CommandComposite("Gespeicherte Umrechnungen");
    }

    public void saveCommand(ICommand command){
        this.command = command;
    }
    public void activate(){
        log.add(command);
        undolog.push(command);
        command.execute();
    }
    public void undo(){
        redolog.push(undolog.pop());
        command = undolog.pop();
        activate();
    }
    public void redo(){
        command = redolog.pop();
        activate();
    }
    public void drawLog(){
        System.out.println("#####################################################################################################");
        System.out.println("#################################################LOG#################################################");

        for(ICommand c: log){
            c.drawLog();
        }
        System.out.println("#####################################################################################################");
        System.out.println("#####################################################################################################");
    }
    public void compositeNewMonth(String name){
        current = new CommandComposite(name);
        saved.addComponent(current);
    }
    public void addToThisMonth(ICommand comd){
        current.addComponent(comd);
    }
    public void drawSaved(){
        saved.drawLog();
    }

}
