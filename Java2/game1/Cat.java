package Java2.game1;

public class Cat implements CanRun, CanJump{
    private String name;
    private int maxRun;
    public int maxJamp;

    public Cat(String name, int maxRun, int maxJamp) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJamp = maxJamp;
    }
     @Override
    public String jamp(int height) {
        String result;
        if (maxJamp>height){
            result="Кот перепрыгнул препятствие";
            } else {
            result="Кот не перепрыгнул препятствие";
        } return result;
   }

    @Override
    public double run(int length) {
        return maxRun*length;
    }



}
