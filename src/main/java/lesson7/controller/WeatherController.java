package lesson7.controller;

import lesson7.model.AccuWeatherProvider;
import lesson7.model.IWeatherProvider;
import lesson7.model.Period;

public class WeatherController implements IWeatherController{
    private IWeatherProvider weatherProvider = new AccuWeatherProvider();
    @Override
    public void onUserInput(int command) {
        switch (command) {
            case 1:
                getFiveDaysWeather();
                break;
        }
    }
    private void getFiveDaysWeather() {

        weatherProvider.getWeather(Period.FIVE_DAYS);
    }
}