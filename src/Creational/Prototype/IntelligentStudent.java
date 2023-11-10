package Creational.Prototype;

public class IntelligentStudent extends Student {

    int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent student) {
        super(student); // Constructor chaining
        this.iq = student.iq;
    }

    // Copy constructor
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);

        /*
        * If it Student setter was private, We cannot set/get the values from here
        * */
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.iq = this.iq;
//        intelligentStudent.setName(this.getName());
//        intelligentStudent.setAge(this.getAge());
//        return intelligentStudent;
    }
}
