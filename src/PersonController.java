import java.util.Calendar;

public class PersonController {
    private Person model;
    private PersonView view;

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

    public void setPersonDob(Calendar dob){
        model.setDob(dob);
    }

    public Calendar getPersonAge(){
        return model.getDob();
    }

    public void updateView(){
        view.printPersonDetails(model.getFirstName(),model.getGender(),model.getDob());
    }

}
