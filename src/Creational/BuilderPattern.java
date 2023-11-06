package Creational;

public class BuilderPattern {
    public static void main(String[] args) {
        Student std = Student.getBuilder()
                .setName("Mani")
                .setAge(25)
                .setGradYear(2019)
                .build();

        System.out.println(std);
    }
}

class Student {
    private String name;
    private int age;
    private int gradYear;
    private String univName;
    private double psp;

    public Student(Builder builder) {
        this.age = builder.getAge();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private int age;
        private int gradYear;
        private String univName;
        private double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public void setUnivName(String univName) {
            this.univName = univName;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public Student build() {
            // validation
            if (age > 25) {
                throw new IllegalArgumentException();
            }

            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradYear=" + gradYear +
                ", univName='" + univName + '\'' +
                ", psp=" + psp +
                '}';
    }
}