package day00;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("lisi", 12);
        Student s2 = new Student("lisi", 11);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
class Student
{
    String name;
    int age;
    Student(String n, int a)
    {
        name = n;
        age = a;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 34 ;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.name.equals(s.name) && this.age == s.age;
    }
}
