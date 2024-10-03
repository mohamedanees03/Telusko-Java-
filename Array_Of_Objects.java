public class Array_Of_Objects {
    public static void main(String[] args) {

        // Creating individual Student objects
        Student s1 = new Student();
        s1.id = 108;
        s1.name = "Anees";
        s1.marks = 98;

        Student s2 = new Student();
        s2.id = 112;
        s2.name = "Hari";
        s2.marks = 100;

        Student s3 = new Student();
        s3.id = 129;
        s3.name = "Praveen";
        s3.marks = 94;

        // Creating an array of Student objects
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Using an enhanced for loop to iterate through the array
        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}

// Defining the Student class
class Student {
    int id;
    java.lang.String name;  // Ensure 'String' is java.lang.String, not a custom one
    int marks;
}
