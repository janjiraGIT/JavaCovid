import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public void Run() {
        String maxChar = Stream.of("H", "T", "D", "I", "J")
                .max(Comparator.comparing(String::valueOf))
                .get();
        System.out.println(maxChar);

        //Person person1 = new Person("Janjira",43, 45000);
        //Person person2 = new Person("Benjamin",33, 75000);
        //Person person3 = new Person("Jarin",18, 25000);

        List<Person> personList = new ArrayList<Person>();
        //personList.add(person1);
        //personList.add(person2);
        //personList.add(person3);

        Comparator<Person> comparator = Comparator.comparing(Person::getAge);

        Person youngest = personList.stream().min(comparator).get();
        Person oldest = personList.stream().max(comparator).get();

        System.out.println("The youngest person is " + youngest);
        System.out.println("The oldest person is " + oldest);

        Integer numbers = Stream.of(1,2,3,4)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(numbers);

    }
}
