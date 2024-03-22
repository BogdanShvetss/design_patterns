package observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observes = new ArrayList();
    }


    @Override
    public void registerObserver(Observer o) {
        observes.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observes.indexOf(o);

        if (i >= 0) {
            observes.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observes.size(); i++) {
            Observer observer = (Observer) observes.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}