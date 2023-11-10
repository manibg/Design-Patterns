package Creational.Prototype;

public class Student implements ProtoType<Student> {
    private String name;
    private String batch;
    private int age;
    private double batchAvgPsp;
    private double studentPsp;
    public Student() {}

    // Copy constructor - This also resolves Open closed principle
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.batchAvgPsp = student.batchAvgPsp;
        this.studentPsp = student.studentPsp;
    }
    @Override
    public Student clone() {
        return new Student(this);

        /*Student student = new Student();
        student.setName(this.name);
        student.setAge(this.age);
        student.setBatch(this.batch);
        student.setBatchAvgPsp(this.batchAvgPsp);
        student.setStudentPsp(this.studentPsp);
        return student;*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBatchAvgPsp() {
        return batchAvgPsp;
    }

    public void setBatchAvgPsp(double batchAvgPsp) {
        this.batchAvgPsp = batchAvgPsp;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }
}
