import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        while (true) {
            System.out.print("Enter a week in english: ");
            String getWeek = input.next().toUpperCase();
            for (Week week : weeks) {
                if (week.name().equals(getWeek)) {
                    switch (week) {
                        case MONDAY -> System.out.println("Дуйшөмбү куну жава окуйм");
                        case TUESDAY -> System.out.println("Шейшемби куну английский тили");
                        case WEDNESDAY -> System.out.println("Шаршемби куну жава окуйм");
                        case THURSDAY -> System.out.println("Бейшемби куну softskills");
                        case FRIDAY -> System.out.println("Жума куну жава окуйм");
                        case SATURDAY -> System.out.println("Ишемби куну жава окуйм");
                        case SUNDAY -> System.out.println("Жекшемби куну жава окуйм");
                        default -> System.out.println("No such day of the week!");
                    }
                }
            }
        }
    }
}