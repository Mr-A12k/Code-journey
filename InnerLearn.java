import java.util.*;

public class InnerLearn{
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Kabil";
        s1.age=22;
        s1.rno=1;

        Student ran = new Student(s1);

        System.out.printf(s1.age+" "+s1.name+" "+s1.rno);
        System.out.println();
        System.out.println(ran.age+" "+ran.name+" "+ran.rno);
        System.out.println(ran);
        System.out.println(s1);
    }

    static class Student{
        String name;
        int age;
        int rno;


        
        Student() {
            this.name = "kabix";
        }

        Student(Student s1){
            this.name=s1.name;
            this.age=s1.age;
            this.rno=s1.rno;
        }

        // Student(){
        //     this(12,"aaa",23);
        // }


    }
}