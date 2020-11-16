package homework7.inheritance.people;

public class Professor extends Person {
    private String universityName;
    private String degree;
    private String course;
    private double hourlyRate;
    private int academHours;

    public Professor(String name, String degree, String address) {
        super(name, address);
        this.degree = degree;
        System.out.println("Personal information: \n" +
                "Name: " + name + "\n" +
                "Degree: " + degree + "\n" +
                "Address: " + address);
    }

    public Professor(String name, String universityName, String course, String address) {
        super(name, address);
        this.course = course;
        this.universityName = universityName;
        System.out.println("Personal information: \n" +
                "Name: " + name + "\n" +
                "University name: " + universityName + "\n" +
                "Course: " + course + "\n" +
                "Address: " + address);
    }

    double countSalary() {
        return hourlyRate * academHours;
    }

    @Override
    public void work() {
        System.out.println("Salary: " + countSalary() + "\n" + " " + "\n");
    }

    public String getDegree() {
        return degree;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setAcademHours(int academHours) {
        this.academHours = academHours;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
