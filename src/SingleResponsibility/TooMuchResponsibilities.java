package SingleResponsibility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TooMuchResponsibilities {

    public static void main(String[] args) {
        printDate();
    }

    private static void printDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
