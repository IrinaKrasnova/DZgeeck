package DZ5Java2;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        try (OutputStream outputStream1 = new FileOutputStream("second.txt")) {
            outputStream1.write("val1;val2;val3 \n 100;200;300\n 100;200;300 ".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (InputStreamReader in = new InputStreamReader(new FileInputStream("second.txt"))) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayList<Data> dataArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            String tempString;
            tempString = bufferedReader.readLine();
            while ((tempString = bufferedReader.readLine()) != null) ;
            String[] values = tempString.split(";");
            dataArrayList.add(new AooData(values[0], values[1]));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dataArrayList);
    }

}


