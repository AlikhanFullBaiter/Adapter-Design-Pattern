package src;

class ModernTemperatureSystem {
    private CelsiusTemperatureProvider celsiusProvider;

    public ModernTemperatureSystem(CelsiusTemperatureProvider celsiusProvider) {
        this.celsiusProvider = celsiusProvider;
    }

    public void displayTemperature() {
        double celsiusTemperature = celsiusProvider.getTemperatureInCelsius();
        System.out.println("Temperature in Celsius: " + celsiusTemperature);
    }
}