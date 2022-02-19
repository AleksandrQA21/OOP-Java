package Task2.Run;

/*
Создайте пример наследования, реализуйте класс Student и класс Aspirant,
аспирант отличается от студента наличием некой научной работы.

а) Класс Student содержит переменные: String firstName, lastName, group.
А также, double averageMark, содержащую среднюю оценку.
б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */

import Task2.Aspirant.Aspirant;
import Task2.Student.Student;

public class Run {
    public static void main(String[] args) {
//Создаем обьект класса Студент
        Student student1 = new Student("Даша", "Сидорчук",
                "Группа1", 4.75);
        System.out.println("Имя студента - " + student1.getFirstName() + ". Средний балл -  " + student1.getAverageMark());
        System.out.println(student1.getScholarship());
        System.out.println("=================================================");
//Создаем обьект класса Аспирант
        Student aspirant1 = new Aspirant("Роман","Яремчук",
                5.0,
                "Методы и подходы к изучению сферического коня в вакууме");
        System.out.println(aspirant1.getFirstName() + ". Средний балл - " + aspirant1.getAverageMark());
        System.out.println(aspirant1.getScholarship());
        System.out.println("=================================================");
//Создаем массив содержащий обьекты класса студент и аспирант
        Student [] students = {student1,aspirant1};

        for (Student student: students) {
            System.out.println(student.getScholarship());
        }
    }
}
