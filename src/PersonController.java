import java.util.GregorianCalendar;

public class PersonController {
    private Person model;
    private PersonView view;
    private int age;

    public PersonController(Person model,PersonView view){
        this.model = model;
        this.view = view;

    }

    public void setPersonFirstName(String firstName){
        model.setFirstName(firstName);
    }


    public void setPersonLastName(String lastName){
        model.setLastName(lastName);
    }

    public String getPersonName(){
        return model.getFirstName() + " " + model.getLastName();
    }

    public void setPersonGender(String gender){
        model.setGender(gender);
    }

    public String getPersonGender(){
        return model.getGender();
    }

    public void setPersonDob(GregorianCalendar gregorianCalendar){
        model.setDob(gregorianCalendar);
    }



    public int calculateAge(){
        GregorianCalendar gregorianCalendarNow  = new GregorianCalendar();
        GregorianCalendar gregorianCalendarUser = model.getDob();
        age = gregorianCalendarNow.get(1) - gregorianCalendarUser.get(1);
        return age;
    }



    public void updateView(){

        view.printPersonDetails(getPersonName(),model.getGender(),calculateAge());

    }

}
