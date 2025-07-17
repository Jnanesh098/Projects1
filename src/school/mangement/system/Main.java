package school.mangement.system;

import java.util.ArrayList;
import java.util.List;
public class Main 
{
	public static void main(String[] args) 
	{
        Teacher Shini = new Teacher(1,"Shini",500);
        Teacher Jhansi = new Teacher(2,"Jhansi",700);
        Teacher Kajal = new Teacher(3,"Kajal",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Shini);
        teacherList.add(Jhansi);
        teacherList.add(Kajal);


        Student Krishna = new Student(1,"Krishna",4);
        Student Jnanesh = new Student(2,"Jnanesh",12);
        Student Prabhas = new Student(3,"Prabhas",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Krishna);
        studentList.add(Jnanesh);
        studentList.add(Prabhas);

        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);
        ghs.addTeacher(megan);

        Krishna.payFees(5000);
        Prabhas.payFees(6000);
        System.out.println("GHS has earned "+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Shini.receiveSalary(Shini.getSalary());
        
        System.out.println("GHS has spent for salary to " + Shini.getName()
                     +" and now has " + ghs.getTotalMoneyEarned());

        Jhansi.receiveSalary(Jhansi.getSalary());
        System.out.println("GHS has spent for salary to " + Jhansi.getName()
                     +" and now has " + ghs.getTotalMoneyEarned());

        System.out.println(Jnanesh);
     
        Jhansi.receiveSalary(Jhansi.getSalary());
        System.out.println(Jhansi);
     }
}
