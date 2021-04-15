package DZ5Java2;

public class AooData {
    private String header;
    private int data;

    public AooData(String header, int data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        return "AooData{" +
                "header='" + header + '\'' +
                ", data=" + data +
                '}';
    }
}
