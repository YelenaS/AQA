package homework7.inheritance;

import homework7.inheritance.people.HumanScientist;
import homework7.inheritance.people.Professor;
import homework7.inheritance.people.Student;
import homework7.inheritance.people.TechnicalScientist;

/*
 * Task:
 * There are a base Person class and subclasses (the Professor, Student classes).
 * You have to do the following:
 *   1. Complete Professor, Student classes by implementing abstract method work();
 *   2. Add getters and setters in each class;
 *   3. Add some specific methods to expand subclasses with new behavioral;
 *   4. Follow the principals of encapsulations;
 *   5. Create at least 3 new classes that inherit already provided ones and perform 4 points decribed in the above;
 * The classes to complete the task are in io.github.valentyn.nahai.oop.inheritance.people package.
 *
 * Задача:
 * Есть базовый класс Person и подклассы (классы Professor, Student).
 * Вам необходимо сделать следующее:
 *   1. Завершить классы профессора, ученика, реализовав абстрактный метод work ();
 *   2. Добавить геттеры и сеттеры в каждый класс;
 *   3. Добавить некоторые специфические методы для расширения подклассов с новым поведением;
 *   4. Следовать принципам инкапсуляции;
 *   5. Создать как минимум 3 новых класса, которые наследуют уже предоставленные, и выполнить 4 пункта, описанных выше;
 * Классы для выполнения задачи находятся в пакете io.github.valentyn.nahai.oop.inheritance.people.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        //People >> PROFESSOR
        Professor professor1 = new Professor("Dio Rouge", "Academic", "Lyon, France");
        professor1.setHourlyRate(80);
        professor1.setAcademHours(35);
        professor1.work();

        //People >> PROFESSOR
        Professor professor2 = new Professor("Dio Rouge", "National University", "5", "Lyon, France");
        professor2.setHourlyRate(90.5);
        professor2.setAcademHours(30);
        professor2.work();

        //People >> Professor >> TECHNICAL SCIENTIST
        TechnicalScientist technicalScientist = new TechnicalScientist("Alp Seven", "Lecturer", "Izmir,Turkey");
        technicalScientist.setSpeciality("Engineering");
        technicalScientist.setDegree("Master");
        technicalScientist.setCourse("3");
        technicalScientist.setHourlyRate(100.5);
        technicalScientist.setAcademHours(40);
        technicalScientist.work();

        //People >> Professor >> HUMAN SCIENTIST
        HumanScientist humanScientist = new HumanScientist("Ivan Molodets", "Politech", "Kyiv, Ukraine");
        humanScientist.setHourlyRate(23);
        humanScientist.setAcademHours(40);
        humanScientist.setLessonType("practice lesson");
        System.out.println("Lesson Type: " + humanScientist.getLessonType());
        humanScientist.work();

        //People >> STUDENT
        Student student = new Student("Johanna Smith", "New York");
        student.setGender("Female");
        student.setLesson(18);
        System.out.println(student.toString());
        student.work();

    }
}
