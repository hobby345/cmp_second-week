public class Landanimal extends Animal {
    @Override
    String move(){
        return "swings on tree";
    }
    public static void main(String[] args) {
        // Landanimal lion = new Landanimal();
        Landanimal monkey = new Landanimal();
        System.out.println(monkey.move());

    }

}
