package homework7.inheritance.people;


public class Student extends Person {
    private int lesson;

    public Student(String name, String address) {
        super(name, address);
    }

    public double study() {
        return lesson * 2;  // 2 scores for 1 lesson visiting
    }

    @Override
    public void work() {

        System.out.println("Status: Student "  + "\n" +
                "Number of lessons: " + getLesson() + "\n" +
                "Scholarship: " + study() + "\n" + "" + "\n");
    }


    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }
}
