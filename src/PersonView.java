import java.util.Calendar;

public class PersonView {
    public void printPersonDetails(String personName, String gender, Calendar age){
        System.out.println("Person: ");
        System.out.println("Name:"+personName);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
}
