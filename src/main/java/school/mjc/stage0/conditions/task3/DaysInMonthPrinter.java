package school.mjc.stage0.conditions.task3;

import java.time.YearMonth;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month > 12 || month <= 0) {
            System.out.println("wrong number!");
            return;
        }
        int year = 2019;
        YearMonth yearMonth = YearMonth.of(year,month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.println(daysInMonth);
    }
}
