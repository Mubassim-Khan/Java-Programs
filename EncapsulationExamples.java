package Examples;
// Taking example as a Cat
public class EncapsulationExamples {
    private int mood = 50;
    private int hunger = 50;
    private int sleep = 50;

    public void play() {
        System.out.println("Playing... :)");
        mood++;
        hunger++;
        sleep--;
    }

    public void feed() {
        System.out.println("Feeding...");
        hunger--;
        sleep++;
        mood++;
    }

    public void sleep() {
        System.out.println("Sleeping... x__x");
        sleep--;
        mood--;
    }

    public void sound() {
        System.out.println("Meowwwwwwwwwwww");
    }

    public int getMood() {
        return mood;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSleep() {
        return sleep;
    }

    public static void main(String[] args) {
        EncapsulationExamples cat = new EncapsulationExamples();
        System.out.println("Hunger level is : " + cat.getHunger());
        System.out.println("Sleep level is : " + cat.getSleep());
        System.out.println("Mood level is : " + cat.getMood());

        cat.play();
        cat.sleep();
        cat.feed();
    }
}


