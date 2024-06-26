package Creational.BuilderPattern;

public class BuilderMain {
    public static void main(String[] args) {
        Student std = Student.getBuilder()
                .setName("Mani")
                .setAge(25)
                .setGradYear(2019)
                .build();

        System.out.println(std);
    }
}