package SingleResponsibility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemQuery {
    public String getUsername() {
        return System.getProperty("user.name");
    }

    public String getTimeStamp() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
