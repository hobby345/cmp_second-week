public class Aquatic extends Animal{
    @Override
    String move(){
        return "live inside the water";
    }
    public static void main(String[] args) {
        // Landanimal lion = new Landanimal();
        Aquatic fish = new Aquatic();
        System.out.println(fish.move());

    }
}
