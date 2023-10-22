package src;

public class Main {
    public static void main(String[] args) {
        FahrenheitTemperatureProvider fahrenheitProvider = new FahrenheitTemperatureProvider();
        CelsiusTemperatureProvider adapter = new FahrenheitToCelsiusAdapter(fahrenheitProvider);
        ModernTemperatureSystem temperatureSystem = new ModernTemperatureSystem(adapter);

        temperatureSystem.displayTemperature();
    }
}