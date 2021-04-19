package Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList(Arrays.asList(
                new Student("Anna", Arrays.asList(new Course("Math"),
                        new Course("Culture"))),
                new Student("Max", Arrays.asList(new Course("Math"),
                        new Course("IT"), new Course("Ecology"), new Course("Culture"))),
                new Student("Olga", Arrays.asList(new Course("Math"),
                        new Course("IT"), new Course("Culture"))),
                new Student("Mark", Arrays.asList(new Course("Math"),
                        new Course("Ecology"), new Course("Culture"))),
                new Student("Sergey", Arrays.asList(new Course("Math"),
                        new Course("Testing"), new Course("Biology")))
        ));
        System.out.println(students.stream()
                .map(student -> student.getCourses())
                .flatMap(c -> c.stream())
                .collect(Collectors.toSet()));

        System.out.println("Задание 2");
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));

        Course course = new Course("IT");
        System.out.println("Задание 3");
        System.out.println(students.stream()
                .filter(student -> student.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
