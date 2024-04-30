public class Admin extends User{
    @Override
    String RegisterCourse(){
        return "admin logged in succesfully";
    }
    public static void main(String[] args) {
        Admin admin = new Admin();
        System.out.println(admin.RegisterCourse());
        // admin.RegisterCourse();
    }
}
