package Java2Lesson2;

public class Main {

        public static void main(String[] args) {

            String[][] arr = new String[][]{{"2", "2", "1", "3"}, {"4", "2", "2", "3"}, {"1", "2", "3", "2"}, {"2", "4", "3", "2"}};
            try {
                try {
                    int result = method(arr);
                    System.out.println( "Рузультат сложения элементов массива =  " +result);
                } catch (MyArraySizeException e) {
                    System.out.println("Размер массива превышен!");
                }
            }
            catch (MyArrayDataExeption e) {
                System.out.println("Неправильное значение массива!");
                System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
            }

        }


        public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataExeption {
            int count = 0;
            if (arr.length != 4) {
                throw new MyArraySizeException();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        count = count + Integer.parseInt(arr[i][j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyArrayDataExeption(i, j);
                    }
                }

            }
            return count;
        }

    }

