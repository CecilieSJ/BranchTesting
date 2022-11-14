public class Cat extends Animal {

    @Override
    public void makesound() {
        System.out.println("miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood) {
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }


}
