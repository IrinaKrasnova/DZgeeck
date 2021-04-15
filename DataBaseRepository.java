package lesson6;

import java.sql.*;
import java.util.List;

public class DataBaseRepository {
    private static final String DB_NAME = "geeckbrains.db";
    private List<Weather> weathers;
    String insertWeather = "insert  into weather" +
            " (city, localdate, temperature, weather_text) values (?, ?, ?, ?)";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    public boolean saveWeatherData(Weather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection
                ("jdbc:sqlite:d:/kurs iava/geeckbrains.db")) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getLocalDate());
            saveWeather.setDouble(4, weather.getTemperature());
            saveWeather.setString(3, weather.getWeatherText());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Сохранение погоды в базу данных не выполнено!");
    }


    public List <Weather> getSaveWeatherData() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:d:/kurs iava/geeckbrains.db")) {
            Statement getSaveWeather = connection.createStatement();
            ResultSet resultSet = getSaveWeather.executeQuery("select*from weather");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print("  ");
                System.out.print(resultSet.getString("City"));
                System.out.print("  ");
                System.out.print(resultSet.getString("localDate"));
                System.out.print("  ");
                System.out.print(resultSet.getString("weatherText"));
                System.out.print("  ");
                System.out.print(resultSet.getDouble("temperature"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
         System.out.println();
    }



        public static void main(String[] args) throws SQLException {
        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        dataBaseRepository.saveWeatherData(
                new Weather("Moskow", "12.12.12", "Хорошая", 0.3));
    }
}
