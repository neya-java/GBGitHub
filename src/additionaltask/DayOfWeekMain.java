package additionaltask;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println("Сегодня: "+ DayOfWeek.SUNDAY);
        System.out.print("Осталось рабочих часов: ");
        System.out.println(getWorkingHours(DayOfWeek.SUNDAY));
    }

    static int getWorkingHours(DayOfWeek day){
        int workingDays = 0;
        switch (day) {
            case MONDAY:
                workingDays = 5*8;
                break;
            case TUESDAY:
                workingDays = 4*8;
                break;
            case WEDNESDAY:
                workingDays = 3*8;
                break;
            case THURSDAY:
                workingDays = 2*8;
                break;
            case SATURDAY:
                printDayOf();
                break;
            case SUNDAY:
                printDayOf();
                break;
        }
        return workingDays;
    }

    public static void printDayOf() {
        System.out.println("Ноль. Сегодня выходной");
    }
}