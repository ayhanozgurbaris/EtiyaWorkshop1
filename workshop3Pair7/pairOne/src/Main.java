public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ali","Veli",1,1,1);
        Student student2 = new Student("Ayşe","Özge",2,2,2);
        Student student3 = new Student("Suphi","thr",2,3,3);
        Student student4 = new Student("Suphiye","blknsasa",4,4,4);
        Student student5 = new Student("murat","seli",6,4,5);
        Student student6 = new Student("kemal","kamil",7,6,6);


        StudentManager studentManager = new StudentManager();

        studentManager.ekle(student1);
        studentManager.ekle(student2);
        studentManager.ekle(student3);
        studentManager.ekle(student4);
        studentManager.ekle(student5);
        studentManager.ekle(student6);


         studentManager.list();

         studentManager.delete(student1);
         studentManager.list();

    }
}

//özgür barış ayhan
//mert can aktaş
//uğur atasoy
