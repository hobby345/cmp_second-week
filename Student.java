public class Student extends User {
    @Override
    String RegisterCourse(){
        return "courses registered successfully.";
    }
    public static void main(String[] args) {
        Student student =new Student();
        System.out.println(student.RegisterCourse());
        System.out.println("result not yet out");
    }
}
