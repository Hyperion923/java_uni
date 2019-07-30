package lösungen.t2;

public class Tamagotchi {
    int hunger;
    int mood;
    int fatigue;
    private int hungry;
    private int happy;
    private int tired;

    public Tamagotchi(int _hungry, int _happy, int _tired) {
        hungry = _hungry;
        happy = _happy;
        tired = _tired;
    }


    void eat() {
        if (fatigue <= tired) {
            hunger -= 3;
            fatigue += 2;
        }
    }

    void sleep() {
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

    void play() {
        if (hunger <= hungry) {
            hunger += 2;
            mood += 2;
            fatigue += 3;
        }
    }

    void pet() {
        hunger += 1;
        mood += 2;
    }
    String getGenerelCondition(){
        if (fatigue >  tired){
            return "tired";
        }else if (mood > happy){
            return "";
        }
    }
}