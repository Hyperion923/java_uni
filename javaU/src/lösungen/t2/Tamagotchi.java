package lösungen.t2;

public class Tamagotchi {
    private int hunger;
    private int mood;
    private int fatigue;
    private int hungry;
    private int happy;
    private int tired;

    public Tamagotchi(int _hungry, int _happy, int _tired) {
        hungry = _hungry;
        happy = _happy;
        tired = _tired;
    }


    public void eat() {
        if (fatigue <= tired) {
            hunger -= 3;
            fatigue += 2;
        }
    }

    public void sleep() {
        if (hunger <= hungry) {
            hunger += 1;
            mood += 1;
            fatigue = 0;
        } else {
            hunger += 1;
            mood -= 1;
            fatigue = 0;
        }
    }

    public void play() {
        if (hunger <= hungry) {
            hunger += 2;
            mood += 2;
            fatigue += 3;
        }
    }

    public void pet() {
        hunger += 1;
        mood += 2;
    }

    public String getGeneralCondition() {
        if (fatigue > tired) {
            return("tired");
        } else if (hunger > hungry) {
            return("hungry");
        } else if (mood > happy) {
            return("happy");
        } else return("indifferent");
    }

    public void makeHappy() {
        pet();
        eat();
        sleep();

    }

    public static void main(String[] args) {
        Tamagotchi t = new Tamagotchi(0, 0, 0);
        t.makeHappy();

        System.out.println(t.getGeneralCondition());
    }
}
