package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

    public double ConvertirCelciusAFarenheit(double inputValue) {
        double fahrenheitResult = inputValue * 1.8 + 32;
        fahrenheitResult = (double) Math.round(fahrenheitResult * 100d) / 100;
        JOptionPane.showMessageDialog(null, inputValue + " Celsius is " + fahrenheitResult + " Fahrenheit");
        return fahrenheitResult;
    }

    public void ConvertirCelciusAKelvin(double inputValue) {
        double kelvinResult = inputValue + 273.15;
        kelvinResult = (double) Math.round(kelvinResult * 100d) / 100;
        JOptionPane.showMessageDialog(null, inputValue + " Celsius is " + kelvinResult + " Kelvin");
    }

    public void ConvertirFarenheitACelcius(double inputValue) {
        double celsiusResult = (inputValue - 32) / 1.8;
        celsiusResult = (double) Math.round(celsiusResult * 100d) / 100;
        JOptionPane.showMessageDialog(null, inputValue + " Fahrenheit is " + celsiusResult + " Celsius");
    }

    public double ConvertirKelvinACelcius(double inputValue) {
        double celsiusFromKelvin = inputValue - 273.15;
        celsiusFromKelvin = (double) Math.round(celsiusFromKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, inputValue + " Kelvin is " + celsiusFromKelvin + " Celsius");
        return celsiusFromKelvin;
    }

    public void ConvertirKelvinAFarenheit(double inputValue) {
        double fahrenheitFromKelvin = ConvertirKelvinACelcius(inputValue);
        fahrenheitFromKelvin = ConvertirCelciusAFarenheit(fahrenheitFromKelvin);
        fahrenheitFromKelvin = (double) Math.round(fahrenheitFromKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, inputValue + " Kelvin is " + fahrenheitFromKelvin + " Fahrenheit");
    }
}
