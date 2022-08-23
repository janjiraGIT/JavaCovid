import java.util.ArrayList;

public class ArrayListEx {

    public void Run() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Cake");
        list.add("Cola");
        list.add("Pappsi");
        //System.out.println(list);

        // Loop though all elements and count and find cola
        for (String lists: list) {
            System.out.println("print out list: " +lists);
        }

        for(int i=0; i < list.size(); i++ ) {
            if (list.get(i).equalsIgnoreCase("Cola")) {
                System.out.println("yeah we find Cola");
            }
        }
        System.out.println(list.size());
    }
}
