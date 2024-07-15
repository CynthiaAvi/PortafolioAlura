package principal;

import javax.swing.JOptionPane;
import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;

public class Principal {
    public static void main (String[] args) {

        function currency = new function();
        functionTemperatura temp = new functionTemperatura();

        while(true) {
            String optionSelected = (JOptionPane.showInputDialog(null, "Seleccione un tipo de conversión:", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccione una")).toString();

            switch(optionSelected) {
                case "Conversor de Moneda":
                    String userInput = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
                    if(ValidarNumero(userInput)) {
                        double userAmount = Double.parseDouble(userInput);
                        currency.ConvertirMonedas(userAmount);

                        int userResponse = JOptionPane.showConfirmDialog(null,"¿Desea convertir de nuevo?");
                        if (JOptionPane.OK_OPTION == userResponse){
                            System.out.println("Eligió SÍ");
                        } else {
                            JOptionPane.showMessageDialog(null, "Saliendo del programa");
                            System.exit(0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor no válido");
                    }
                    break;

                case "Conversor de Temperatura":
                    userInput = JOptionPane.showInputDialog("Ingrese la temperatura a convertir:");
                    if(ValidarNumero(userInput)) {
                        double userTemp = Double.parseDouble(userInput);
                        temp.ConvertirTemperatura(userTemp);

                        int userResponse = JOptionPane.showConfirmDialog(null, "¿Continuar?");
                        if (JOptionPane.OK_OPTION != userResponse) {
                            JOptionPane.showMessageDialog(null, "Saliendo del programa");
                            System.exit(0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor no válido");
                    }
                    break;
            }                
        }
    }

    public static boolean ValidarNumero(String userInput) {
        try {
            Double.parseDouble(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
