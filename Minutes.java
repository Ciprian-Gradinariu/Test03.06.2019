public class Minutes implements Clock {

    private static final String red = "R";
    private static final String yellow = "Y";
    private static final String allFourLightsOff = "0000";


    private String getLampsForMinuteFive(int m) {

        StringBuilder lmp = new StringBuilder();

        for (int i = 0; i < m; i++) {

            if (0 == (i + 1) % 3) {
                lmp.replace(i, i + 1, red);

            } else {
                lmp.replace(i, i + 1, yellow);

            }
        }
        return lmp.toString();
    }

    private String getLampsForMinuteSingle(int m) {

        StringBuilder lmp = new StringBuilder(allFourLightsOff);

        for (int i = 0; i < m; i++) {
            lmp.replace(i, i + 1, yellow);

        }

        return lmp.toString();
    }


    public String getClock(int m) {

        int minuteDivided = m / 5;

        int minuteModule = m % 5;

        return getLampsForMinuteFive(minuteDivided) + "\n" + getLampsForMinuteSingle(minuteModule);
    }

}
