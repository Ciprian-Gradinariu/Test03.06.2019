import java.util.ArrayList;
import java.util.List;

public class Test {

    private static List<Clock> testClock = new ArrayList<Clock>();

    public static void main(String args[]) {

        testClock.add(new Seconds());
        testClock.add(new Minutes());
        testClock.add(new Hours ());

        System.out.println(getTime("15:19:22"));

    }

    private static String getTime(String time) {
        StringBuilder timeS = new StringBuilder();
        String[] timeElemnts = time.split(":");

        int i = 0;
        int j = 2;

        for (Clock timeUnit : testClock) {
            for (String timeElemnt : timeElemnts) {
                timeS.append(testClock.get(i).getClock(Integer.parseInt(timeElemnts[j]))).append("\n");
                i++;
                j--;
                break;
            }
        }
        return timeS.toString();
    }


}


