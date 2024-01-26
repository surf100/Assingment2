public class Student extends Person {
    private double gpa;

    // default constructor
    public Student() {
        super();
    }

    // parameterized constructor to initialize name, surname, and GPA
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    // implementation of getPosition method from the Person class
    @Override
    public String getPosition() {
        return "Student";
    }

    // implementation of getPaymentAmount method from the Payable interface
    @Override
    public double getPaymentAmount() {
        if (this.gpa > 2.67) {
            return 36660.00;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ngpa = " + gpa +
                "\nsalary = " + getPaymentAmount() + " tg\n";
    }
}
