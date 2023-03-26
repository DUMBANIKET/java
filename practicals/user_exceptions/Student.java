package practicals.user_exceptions;

public class Student {
    private String name;
    private int rollNo;
    private int age;
    private String course;

    public Student(String name, int rollNo, int age, String course){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}
