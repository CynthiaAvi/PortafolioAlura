package conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	ConvertirTemperatura tempConverter = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double userValue) {
    	String userOption = (JOptionPane.showInputDialog(null, "Choose a conversion option", "Temperature Conversion", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celsius to Fahrenheit", "Celsius to Kelvin", "Fahrenheit to Celsius", "Kelvin to Celsius", "Kelvin to Fahrenheit"}, "Pick one")).toString();
        switch(userOption) {
        case "Celsius to Fahrenheit":
        	tempConverter.ConvertirCelciusAFarenheit(userValue);
        	break;
        case "Celsius to Kelvin":
            tempConverter.ConvertirCelciusAKelvin(userValue);
            break;
        case "Fahrenheit to Celsius":
            tempConverter.ConvertirFarenheitACelcius(userValue);
            break;
        case "Kelvin to Celsius":
            tempConverter.ConvertirKelvinACelcius(userValue);
            break;
        case "Kelvin to Fahrenheit":
            tempConverter.ConvertirKelvinAFarenheit(userValue);
        	break;
        }
	}
}
