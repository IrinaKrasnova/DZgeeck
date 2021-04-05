package Java2Lesson2;

public class MyArrayDataExeption extends Exception {
    public int i;
    public int j;

    MyArrayDataExeption(int i, int j) {
        this.i = i;
        this.j = j;

    }

}


