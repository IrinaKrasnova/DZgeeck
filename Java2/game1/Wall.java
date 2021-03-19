package Java2.game1;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public String Jamp (CanJump jamper){
       return jamper.jamp(height);
    }
}
