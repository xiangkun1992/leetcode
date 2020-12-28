package test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        String datetime = "20181120180916";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime ldt = LocalDateTime.parse(datetime, dtf);



        DateTimeFormatter fa = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String datetime2 = ldt.format(fa);

        Timestamp ts = new Timestamp(System.currentTimeMillis());

        ts = ts.valueOf(datetime2);
        System.out.println(ldt.toString().replace("T", " "));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
