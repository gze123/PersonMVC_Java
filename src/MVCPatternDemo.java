//https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
import java.util.Calendar;
import java.util.Locale;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Person p1 = new Person("Ziy En","Gan","male",cal);
        PersonView view = new PersonView();
        PersonController controller = new PersonController(p1,view);
        controller.updateView();
    }
}
