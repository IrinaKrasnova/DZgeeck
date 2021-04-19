package lesson6;

public class Weather {

    private String City;
    private String localDate;
    private String weatherText;
    private double temperature;

    public Weather(String City, String localDate, String weatherText, double temperature) {
        this.City = City;
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }

    public String getCity() {
        return City;
    }

    public String getLocalDate() {
        return localDate;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setLocaldate(String localDate) {
        this.localDate = localDate;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
