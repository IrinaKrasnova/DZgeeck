package Java2.game1;

public class Human implements CanRun, CanJump {
    private String name;
    private int maxRun;
    private int maxJamp;

    public Human(String name, int maxRun, int maxJamp) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJamp = maxJamp;
    }

    @Override
    public String jamp(int height) {
        String result;
        if (maxJamp>height){
            result="Человек перепрыгнул препятствие";
        } else {
            result="Человек не перепрыгнул препятствие";
        } return result;

    }


    @Override
    public double run(int length) {
        return maxRun*length;
    }

}

