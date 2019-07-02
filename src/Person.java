import java.util.Calendar;

public class Person {
    private String firstName,lastName,gender;
    private Calendar dob;
    private int age;
    public Person(){
    }

    public Person(String firstName,String lastName,String gender,Calendar dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public Calendar getDob(){
        return dob;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }


}
