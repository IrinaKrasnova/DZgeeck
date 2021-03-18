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
    public double jamp(int height) {
        return maxJamp;
    }

    @Override
    public double run(int length) {
        return maxRun * length;
    }

    String getName() {
        return this.name;
    }
}

