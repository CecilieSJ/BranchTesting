public class Main {


    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.makesound();
        dog.makesound();


        cat.eat("Fish");
        dog.eat("bone");

        dog.showMood(true);
        dog.showMood(false);
        cat.showMood(true);
        cat.showMood(false);
    }




}


