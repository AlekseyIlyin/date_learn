import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        Long dateMs1 = 988059600000L;
        Long dateMs2 = 988056000000L;

        System.out.println("LocalDate Instant.ofEpochMilli(dateMs1).atZone(ZoneId.systemDefault()).toLocalDate()");
        System.out.println("---------");
        System.out.println(Instant.ofEpochMilli(dateMs1).atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println(Instant.ofEpochMilli(dateMs2).atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println("---------");
        System.out.println();

        System.out.println("LocalDateTime Instant.ofEpochMilli(dateMs1).atZone(ZoneId.systemDefault()).toLocalDateTime()");
        System.out.println("---------");
        System.out.println(Instant.ofEpochMilli(dateMs1).atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println(Instant.ofEpochMilli(dateMs2).atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println("---------");
        System.out.println();

        System.out.println("java.sql.Date");
        System.out.println("---------");
        System.out.println(new Date(dateMs1));
        System.out.println(new Date(dateMs2));
        System.out.println("---------");
        System.out.println();

        System.out.println("java.util.Date");
        System.out.println("---------");
        System.out.println(new java.util.Date(dateMs1));
        System.out.println(new java.util.Date(dateMs2));
        System.out.println("---------");
        System.out.println();

        System.out.println("java.sql.Timestamp");
        System.out.println("---------");
        System.out.println(new Timestamp(dateMs1));
        System.out.println(new Timestamp(dateMs2));
        System.out.println("---------");
        System.out.println();
    }
}
