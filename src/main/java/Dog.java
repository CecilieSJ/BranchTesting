public class Dog extends Animal{


    @Override
    public void makesound() {
        System.out.println("vuff");

    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood){
            System.out.println("logre");
        }else{
            System.out.println("knurre");
        }
    }



}
