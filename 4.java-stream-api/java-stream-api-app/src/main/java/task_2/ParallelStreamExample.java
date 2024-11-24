package task_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("///////////////// [Задание №2.] /////////////////");

        List<Student> students = Arrays.asList(
                new Student("Student1", Map.of("Math", 90, "Physics", 100)),
                new Student("Student2", Map.of("Math", 95, "Physics", 88)),
                new Student("Student3", Map.of("Math", 88, "Chemistry", 92)),
                new Student("Student4", Map.of("Physics", 78, "Chemistry", 85)));
        System.out.println("Список студентов с предметами");
        for (Student student:students){
            System.out.println(student.toString());
        }

        ConcurrentMap<String, Double> avgGradesBySubject = students.parallelStream()//потокобезопасно
                .flatMap(student -> student.getGrades().entrySet().stream())//разворачиваем мапу оценок
                .collect(Collectors.groupingByConcurrent(
                         Map.Entry::getKey,
                         Collectors.averagingDouble(Map.Entry::getValue)
                ));
        System.out.println("Средние оценки по предметам:");
        avgGradesBySubject.forEach((subject, averageGrade) ->
                System.out.println("Subject: " + subject + ", Average Grade: " + averageGrade));

    }
}
