package session6;

public class Student {
    private int ID;
    private String name;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(int ID, String name, int age, double mark) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
