import java.util.*;
import java.util.stream.Collectors;

public class Stream implements Excercise{

    @Override
    public void RunIt() {
        // Create a new list of person
        List<Person> personList = makeListOfPerson();
        // generate person that married and age over than 40
        getPersonMarriedAgeOver40(personList);

        //System.out.println(personList.stream()
        //        .max(Comparator.comparing
        //                (Person::getAge)));

    }

    private List<Person> makeListOfPerson() {
        Person person1 = new Person("John", 35, Jobs.ACCOUNTANT, 6, "a@gmail", false);
        Person person2 = new Person("Jams", 25, Jobs.DEVELOPER, 2, "b@gmail", true);
        Person person3 = new Person("Jenny", 45, Jobs.PO, 10, "c@gmail", true);
        Person person4 = new Person("Bill", 50, Jobs.CLEANNING, 20, "d@gmail", true);
        List<Person> personList = Arrays.asList(person1, person2, person3, person4);
        if ( personList.isEmpty()) {
            System.out.println("Empty list");
        }
        return personList ;
    }

    public void RunIt2() {

        List<String> strings = Arrays.asList("a", "b", "c", "a", "d", "c");
        List<Person> personList = Arrays.asList(new Person("Hallo", 18, Jobs.PO, 1, "dd@gmailcom", true));
        // filter empty string and add in the new list
        List<String> newStrings = strings
                .stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        //newStrings.forEach(System.out::println); // print out the list

        System.out.println("Look this line : ");
        newStrings.stream()
                .filter(i -> Collections.frequency(newStrings, i) > 1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);



        Random random = new Random();
        //random.ints().limit(5).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(12, 34, 56, 89, 900);
        //numbers.forEach(System.out::print);
        List<Integer> list =numbers.stream()
                .filter(i -> i - 10 > 10 )
                .collect(Collectors.toList());
        //list.forEach(System.out::println);

        List<Integer> list2 =numbers.stream()
                .map(i -> i + 50 )
                .collect(Collectors.toList());
        //list2.forEach(System.out::println);

        //numbers.stream().filter( s -> s.intValue() > 50).forEach(System.out::println);

        List<String> stringList = Arrays.asList("Aan", "Anuluk", "Billy", "Cherry");
        //stringList.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);


        List<Person> personList2 = makeListOfPerson();
        List<InternetAddress> listOfEmail = new ArrayList<>();

        // Get all email address from Person obj from Person list
        // Create a new list to store only email address
        // Print out
        personList2.stream()
                .map(Person::getEmailAddress)
                .map(InternetAddress::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    private void getPersonMarriedAgeOver40(List<Person> personList) {
        // Get smallest year from Person obj from Person list
        // Create a new list to store only email address
        // Print out

        List<Integer> year = new ArrayList<>();
        personList.stream()
                .filter(person -> person.getAge() > 40)
                .filter(person -> person.isMarried())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
