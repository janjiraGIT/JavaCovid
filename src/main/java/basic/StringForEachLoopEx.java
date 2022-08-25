package basic;

public class StringForEachLoopEx {
    public void Run() {
        String day[] = {"Sunday", "Mongday", "Tuesday", "Thursday", "Satuaday"};
            for (int i = 0; i <= day.length-1; i ++) {
                System.out.println(day[i]);
                if (day[i].equalsIgnoreCase("Sunday")) {
                    System.out.println("Yes, today is Sunday");
                }
            }      
        }
}
