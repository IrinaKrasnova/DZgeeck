package Java2.game1;

public class Robot implements CanRun, CanJump{
    private String name;
    private int maxRun;
    private int maxJamp;

    public Robot(String name, int maxRun, int maxJamp) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJamp = maxJamp;
    }

    @Override
    public String jamp(int height) {
        String result;
        if (maxJamp>height){
            result="Робот перепрыгнул препятствие";
        } else {
            result="Робот не перепрыгнул препятствие";
        } return result;
    }


    @Override
    public double run(int length) {
        return maxRun*length;
    }
    String getName() {
        return this.name;
    }
}
