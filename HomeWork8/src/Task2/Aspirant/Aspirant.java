package Task2.Aspirant;

import Task2.Student.Student;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, double averageMark, String scienceWork) {
        super(firstName, lastName, averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public String getFirstName() {
        return "Имя аспиранта - " + super.getFirstName();
    }

    @Override
    public String getScholarship() {
        int a = 200;
        int b = 180;
        return a >= 5.0 ? "Стипендия для " + super.getFirstName() + " " + a : "Стипендия для " + super.getFirstName() + " " + b;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scienceWork='" + scienceWork + '\'' +
                '}';
    }
}
