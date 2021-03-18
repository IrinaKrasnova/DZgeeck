package Java2.game1;

public class Wall {
    private int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    public double getTimeToWall (CanJump jamper){
        return jamper.jamp(heightWall);
    }
}
