public class Student extends Person {

    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public Student() {
        this.gpa = 0.0;

    }

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        /*return "Student{" + "name="+getName()+", age="+getAge()+
                ", gpa=" + gpa +
                '}';*/
        /*return "Student{" + "name="+name+", age="+age+
                ", gpa=" + gpa +
                '}';*/
        return "Student{"+super.toString()+
                ", gpa=" + gpa +
                '}';
    }
}
