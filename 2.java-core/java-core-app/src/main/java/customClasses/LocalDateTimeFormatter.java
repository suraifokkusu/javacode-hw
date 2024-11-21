package customClasses;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class LocalDateTimeFormatter {

    @JsonFormat(pattern = "yyyy:MM:dd'##':HH:mm:ss:SSS", locale = "ru") //+ экранирование
    private LocalDateTime localDateTime;

    public LocalDateTimeFormatter(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "LocalDateTimeFormatter{" +
                "localDateTime=" + localDateTime +
                '}';
    }
}
