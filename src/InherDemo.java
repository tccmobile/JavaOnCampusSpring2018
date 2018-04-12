import java.util.ArrayList;

public class InherDemo {

    public static void main(String arg[]){

        ArrayList<Person> myPeeps = new ArrayList<>();
        ArrayList<Object> stuff =new ArrayList<>();



        Person myPerson = new Person("bob",20);
        Person myPerson2 = new Person("linda",32);
        Person myPerson3  = new Person("Carl",65);
        Student myStudent = new Student("sue",17,3.0);
        Student myStudent2 = new Student("pete", 42,2.21);
        Student myStudent3 = new Student("betty",35,3.8);


       /* myPeeps.add(myPerson);
        myPeeps.add(myStudent);
        myPeeps.add(myPerson2);
        myPeeps.add(myStudent2);
        myPeeps.add(myPerson3);
        myPeeps.add(myStudent3);

        for (Person individual:myPeeps
             ) {
            System.out.println(individual);
        }

        System.out.println("myPeeps = " + myPeeps);*/

        stuff.add("Hello");
        stuff.add(new Integer(42));
        stuff.add(new Double(3.14));
        stuff.add(myPerson);
        stuff.add(myStudent);

        for (Object thing:stuff) {
            System.out.println(thing);
        }



    }
}
