import is.hi.abo25.hbv202g.ass3.frontend.UserInterface;
import is.hi.abo25.hbv202g.ass3.backend.Greeter;
public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        UserInterface ui = new UserInterface();
        String greeting;

        greeter.setEnglish();
        greeting=greeter.greet();
        ui.show(greeting);

        greeter.setGerman();
        greeting=greeter.greet();
        ui.show(greeting);
    }

}