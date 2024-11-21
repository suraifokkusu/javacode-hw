import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import customClasses.LocalDateTimeFormatter;
import customClasses.StringBuilderWithUndo;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("///////////////// [ЗАДАНИЕ #1 StringBuilder] /////////////////");

        StringBuilderWithUndo stringBuilderWithUndo = new StringBuilderWithUndo();

        stringBuilderWithUndo.append("JavaCore");
        System.out.println("1. Append -- " + stringBuilderWithUndo);

        stringBuilderWithUndo.undo();
        System.out.println("2. Undo -- " + stringBuilderWithUndo);

        stringBuilderWithUndo.append("JavaCore again");
        System.out.println("3. Append -- " + stringBuilderWithUndo);

        stringBuilderWithUndo.replace(4, 8, "Code");
        System.out.println("4. Replace -- " + stringBuilderWithUndo);

        stringBuilderWithUndo.delete(9,14);
        System.out.println("5. Delete -- " + stringBuilderWithUndo);

        stringBuilderWithUndo.undo();
        System.out.println("6. Undo -- " + stringBuilderWithUndo);

        stringBuilderWithUndo.undo();
        System.out.println("7. Undo -- " + stringBuilderWithUndo);

        stringBuilderWithUndo.undo();
        System.out.println("8. Undo -- " + stringBuilderWithUndo);

        System.out.println("///////////////// [ЗАДАНИЕ #2 LocalDateTimeFormatter] /////////////////");
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTimeFormatter localDateTimeFormatter = new LocalDateTimeFormatter(currentTime);

        System.out.println("Current datetime with format -- " + localDateTimeFormatter.toString());

        //+сериализация в json

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        String stringJsonDateTime = objectMapper.writeValueAsString(localDateTimeFormatter);
        System.out.println("JSON -- " + stringJsonDateTime);

    }
}
