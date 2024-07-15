package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

    ConvertirMonedas currencyConverter = new ConvertirMonedas();
    ConvertirMonedasAPesos toPesosConverter = new ConvertirMonedasAPesos();
    
    public void ConvertirMonedas(double userInput) {
        String selectedOption = (JOptionPane.showInputDialog(null, 
                "Pick the currency you want to convert to", "Currency Conversion", 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] 
                {"From Pesos to USD", "From Pesos to Euro", "From Pesos to GBP", "From Pesos to JPY", "From Pesos to KRW", "From USD to Pesos", "From Euro to Pesos", "From GBP to Pesos", "From JPY to Pesos", "From KRW to Pesos"}, 
                "Choose")).toString();
        switch(selectedOption) {
        case "From Pesos to USD":
            currencyConverter.ConvertirPesosADolares(userInput);
            break;
        case "From Pesos to Euro":
            currencyConverter.ConvertirPesosAEuros(userInput);
            break;
        case "From Pesos to GBP":
            currencyConverter.ConvertirPesosALibras(userInput);
            break;
        case "From Pesos to JPY":
            currencyConverter.ConvertirPesosAYen(userInput);
            break;
        case "From Pesos to KRW":
            currencyConverter.ConvertirPesosAWon(userInput);
            break;                                            
        case "From USD to Pesos":
            toPesosConverter.ConvertirDolaresAPesos(userInput);
            break;
        case "From Euro to Pesos":
            toPesosConverter.ConvertirEurosAPesos(userInput);
            break;
        case "From GBP to Pesos":
            toPesosConverter.ConvertirLibrasAPesos(userInput);
            break;
        case "From JPY to Pesos":
            toPesosConverter.ConvertirYenAPesos(userInput);
            break;
        case "From KRW to Pesos":
            toPesosConverter.ConvertirWonAPesos(userInput);
            break;
        }      
    }
        
}
