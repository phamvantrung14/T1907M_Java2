package QLStudent;

public class Student {
    private String name;
    private int age;
    private int mark;

    public Student() {
    }

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.mark = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMarks(int marks) {
        this.mark = marks;
    }
}
