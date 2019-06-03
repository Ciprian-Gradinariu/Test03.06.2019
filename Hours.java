public class Hours implements Clock {

    private static final String allLightsOFF = "0000";
    private static final String redLight = "R";
    private static final int multipleOfFive = 5;

    private String getLampForHoursMultipleOfFive(int h) {
        StringBuilder lamps = new StringBuilder(allLightsOFF);

        for (int i = 0; i < (h / multipleOfFive); i++) {
            lamps.replace(i, i + 1, redLight);
        }
        return lamps.toString();
    }
    private String getLampForSingleHours(int h) {
        StringBuilder lmp = new StringBuilder(allLightsOFF);

        for (int i = 0; i < (h % multipleOfFive); i++) {
            lmp.replace(i, i + 1, redLight);
        }
        return lmp.toString();
    }
    public String getClock(int hrs) {
        return getLampForHoursMultipleOfFive(hrs) + "\n" + getLampForSingleHours(hrs);
    }
}
