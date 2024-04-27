package Creational.Prototype;

public class PrototypeMain {

    public static void registerStudentTemplate(StudentRegistry studentRegistry) {
        Student student = new Student();
        student.setBatch("Oct 22 Batch");
        student.setBatchAvgPsp(86.5);
        studentRegistry.register("oct22Batch", student);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        registerStudentTemplate(studentRegistry);

        Student student = studentRegistry.get("oct22Batch").clone();
    }
}
