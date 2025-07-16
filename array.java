 class Student {
    int roll;
    int marks;
    String name;
    
}

public class array {
    public static void main(String[] args) {
        Student s1 = new Student();
            s1.roll = 21;
            s1.marks = 45;
            s1.name = "Pratap";
    Student s2 = new Student();
            s2.roll = 22;
            s2.marks = 46;
            s2.name = "Pratik";
Student s3 = new Student();
            s3.roll = 23;
            s3.marks = 48;
            s3.name = "Sahil";
    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;            
    students[2] = s3;
    // for (int i = 0; i < students.length; i++) {
    //     System.out.println( students[i].name + ":" + students[i].roll + ":" + students[i].marks);
    // }

    for (Student stud : students) {
         System.out.println( stud.name + ":" + stud.roll + ":" + stud.marks);
    }

            

    }
}
