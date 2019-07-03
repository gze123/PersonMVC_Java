//https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm
import java.util.*;


public class MVCPatternDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Person p1 = new Person("hp","acer","male",new GregorianCalendar(1998,1,23));
        PersonView view = new PersonView();
        PersonController controller = new PersonController(p1,view);
        controller.updateView();


        List<Person> personList = new ArrayList<Person>();
        generatePerson(10,personList);


        System.out.println("\nList after filter invalid age:");
        personList.forEach(list -> {
                    boolean ageLimitation = false;
                    if (list.getAge() > 18 && list.getAge() < 50)
                        System.out.println(list.getFirstName() + " " + list.getGender() + " " + list.getAge());
                });



        //greg.get(1) = YEAR
        //greg.get(2) = MONTH
        //greg.get(5) = DAY
    }

    public static void generatePerson(int number,List<Person> list){

        System.out.println();
        int numberOfCharacterForName = 5; //generate 5 character as name
        for (int i = 0; i<number;i++) {
            Person person = new Person();
            Random random = new Random();
            int age = random.nextInt(81 - 1) + 1;
            person.setAge(age);


            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String firstName = "";
            for (int j = 0; j < numberOfCharacterForName; j++) {
                firstName = firstName + alphabet.charAt(random.nextInt(alphabet.length()));

            }
            person.setFirstName(firstName);
            String lastName = "";
            for (int k = 0; k < numberOfCharacterForName; k++) {
                lastName = lastName + alphabet.charAt(random.nextInt(alphabet.length()));

            }
            person.setLastName(lastName);
            String sgender;
            int gender = random.nextInt(2) + 1;
            if (gender > 1)
                sgender = "Male";
            else
                sgender = "Female";

            person.setGender(sgender);

            list.add(person);
            Collections.sort(list,new PersonChainedComparator(
                    new PersonAgeComparator(),
                    new PersonNameComparator())
            );

        }
        System.out.println("First list:");

        list.forEach(personList-> System.out.println(personList.getFirstName()+" "+personList.getGender()+" "+personList.getAge()));

    }



}

