public class Task {
    public static void main(String[] args) {
        String[] days = {"Saturday", "Saturday", "Sunday", "Monday","Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};
        int weekEnds = weekendCount(days);
        int workDays = weekdayCount(days);
        System.out.println("Выходные " + weekEnds + " Будние " + workDays);
    }

    public static boolean isWeekend(String weekDay) {
        if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
            return true;
        } else {
            return false;
        }
    }

    public static int weekendCount(String[] days) {
        int counter = 0;
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }
}
