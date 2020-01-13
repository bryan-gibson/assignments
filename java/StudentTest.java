public class StudentTest {

    public static void main (String [] args) {

        Student student1= new Student("Jane", 95.12);
        Student student2= new Student("Brian", 55);

        System.out.printf("%s's letter grade is %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is %s%n", student2.getName(), student2.getLetterGrade());

        student1.setAverage(85);
        student2.setAverage(-7);

        System.out.printf("%s's letter grade is %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is %s%n", student2.getName(), student2.getLetterGrade());
    }
}
