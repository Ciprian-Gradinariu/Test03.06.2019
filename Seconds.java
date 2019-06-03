public class Seconds implements Clock {

    public String getClock(int s) {

        if (0 == s % 2) {
            return "o";

        } else {
            return "I";
        }
    }
}
