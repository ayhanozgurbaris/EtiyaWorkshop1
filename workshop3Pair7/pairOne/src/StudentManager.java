import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students = new ArrayList<Student>();


    public void ekle(Student student){
      for (Student studenta:students){
          if (studenta.getStudentNo() == student.getStudentNo() || studenta.getNationalityId() == student.getNationalityId()) {
              System.out.println("zaten var");
              return;
          }
      }
        students.add(student);
        System.out.println("öğrenci eklendi: " + student.getFirstName() + " " + student.getLastName());
    }


    public void delete(Student student){
        students.remove(student);
        System.out.println("öğrenci silindi: " + student.getFirstName() + " "+student.getLastName());
    }




    public void list(){
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getStudentNo() + " " + student.getNationalityId() + " "  +student.getGroup());
        }
    }




}
