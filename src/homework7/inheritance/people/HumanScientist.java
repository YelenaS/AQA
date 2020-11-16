package homework7.inheritance.people;

public class HumanScientist extends Professor {
    private String lessonType;

    public HumanScientist(String name, String universityName, String address) {
        super(name, universityName, address);
    }

    @Override
    public void work() {
        System.out.println("Salary:  " + countSalary() + "\n" + "" + "\n");
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }
}




