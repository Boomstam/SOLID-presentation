package SingleResponsibility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TooMuchResponsibilities {

    public static void main(String[] args) {
        printTimeCheck();
    }

    private static void printTimeCheck(){
        String username = System.getProperty("user.name");
        System.out.println("Hi, " + username);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("It is now " + dtf.format(now));
    }
}
