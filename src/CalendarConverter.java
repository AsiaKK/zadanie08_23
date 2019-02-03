public class CalendarConverter {

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String result;
        switch (dayNumber) {
            case MONDAY:
                result = "Monday";
                break;
            case TUESDAY:
                result = "Tuesday";
                break;
            case WEDNESDAY:
                result = "Wednesday";
                break;
            case THURSDAY:
                result = "Thursday";
                break;
            case FRIDAY:
                result = "Friday";
                break;
            case SATURDAY:
                result = "Saturday";
                break;
            case SUNDAY:
                result = "Sunday";
                break;
            default:
                result = "Error";
        }
        return result;
    }
}