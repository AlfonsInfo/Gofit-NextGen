package gofit.common.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppTimeFormat {

    public static String nowTimeStamp(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("dd MM yyyy hh::mm:ss");
        return dateTimeFormatter.format(localDateTime);
    }

}
