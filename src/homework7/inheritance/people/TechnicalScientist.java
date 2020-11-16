package homework7.inheritance.people;

public class TechnicalScientist extends Professor {
    private String speciality;

    public TechnicalScientist(String name, String degree, String address) {
        super(name, degree, address);
    }

    @Override
    public void work() {
        System.out.println("Salary:  " + super.countSalary() + "\n" + " " + "\n");
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
