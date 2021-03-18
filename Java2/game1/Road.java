package Java2.game1;

public class Road {
    private int roadLength;

    public Road(int roadLenth) {
        this.roadLength = roadLenth;
    }
    public double getTimeToRoad (CanRun runner){
        return runner.run(roadLength);
    }
}
