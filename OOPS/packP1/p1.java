package packP1;

class student{
    int rollno;
    String name;
    static String college="ITS";
    
    student(int r,String n){
        rollno=r;
        name=n;
    }
    
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}





public class p1 {
    public static void main(String[] args) {
        student s1 = new student(1, "Alice");
        student s2 = new student(2, "Bob");
        student s3 = new student(3, "Charlie");

        // s1.display();
        // s2.display();
        // s3.display();

       student schoolClass[] = new student[3];
        schoolClass[0] = s1;
        schoolClass[1] = s2;
        schoolClass[2] = s3;

        for (student s : schoolClass) {
            s.display();
        }


    }

}
