public class Dog extends Animal{


    @Override
    public void makesound() {
        System.out.println("vuff");

    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
