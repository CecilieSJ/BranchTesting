public class Cat extends Animal{

    @Override
    public void makesound() {
        System.out.println("miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
