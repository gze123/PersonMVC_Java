import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String firstName,lastName,gender;
    private Calendar dob;
    private int age;
    private GregorianCalendar gregorianCalendar;
    public Person(){
    }

    public Person(String firstName,String lastName,String gender,GregorianCalendar gregorianCalendar){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.gregorianCalendar = gregorianCalendar;
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


    public void setAge(int age) { this.age  =age;
    }

    public int getAge() {
        return age;
    }

    public GregorianCalendar getDob(){
        return gregorianCalendar;
    }

    public void setDob(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }


}
