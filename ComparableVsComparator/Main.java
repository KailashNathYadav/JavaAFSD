import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    private int age;
    private String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student that) {
        return this.getAge() > that.getAge()? 1 : -1;
    }
    
}


class Main{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12,"Ayan"));
        students.add(new Student(23,"Satyam"));
        students.add(new Student(34, "peterson"));
        students.add(new Student(34, "Navin"));
        students.add(new Student(18, "Kane Williamson"));

        //Sort the student on the basis of age in increasing order.
        System.out.println("List of student");
        students.forEach(student -> System.out.println(student));
        Collections.sort(students);
        System.out.println("Sorted List of student on the basis of age");
        students.forEach(student -> System.out.println(student));
        Comparator<Student> comp = new Comparator<Student>() {

            @Override
            public int compare(Student stud1, Student stud2) {
                return stud1.getName().length() > stud2.getName().length() ? 1 : -1;
            }
            
        };
        //Sort the student in the natural ordering of name length.
        Collections.sort(students,comp);
        System.out.println("Sorted List of student on the basis of name length");
        students.forEach(student -> System.out.println(student));
    }
}