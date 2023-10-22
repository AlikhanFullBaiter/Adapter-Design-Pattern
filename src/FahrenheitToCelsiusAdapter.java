package src;

class FahrenheitToCelsiusAdapter implements CelsiusTemperatureProvider {
    private FahrenheitTemperatureProvider fahrenheitProvider;

    public FahrenheitToCelsiusAdapter(FahrenheitTemperatureProvider fahrenheitProvider) {
        this.fahrenheitProvider = fahrenheitProvider;
    }

    @Override
    public double getTemperatureInCelsius() {
        double fahrenheitTemperature = fahrenheitProvider.getTemperatureInFahrenheit();
        return (fahrenheitTemperature - 32) * 5 / 9;
    }
}