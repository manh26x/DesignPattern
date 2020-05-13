import java.util.ArrayList;

public class StaticsDisplay implements DisplayElement, Observer {
    private ArrayList<Float> temperatureList;
    private WeatherData weatherData;

    public StaticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        temperatureList = new ArrayList<>();
    }

    @Override
    public void display() {
        float min = temperatureList.get(0);
        float max = temperatureList.get(0);
        float avg = temperatureList.get(0);
        for(int i = 1 ; i < temperatureList.size(); i++){
            min = Math.min(min, temperatureList.get(i));
            max = Math.max(max, temperatureList.get(i));
            avg = (avg + temperatureList.get(i)) / 2;
        }
        System.out.println("Agv/Max/Min: " + avg +
                "/" +  max + "/" + min);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperatureList.add(temp);
        display();
    }
}
