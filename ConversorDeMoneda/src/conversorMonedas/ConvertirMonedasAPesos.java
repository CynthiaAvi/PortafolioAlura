package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double cantidad) {
		double resultadoDolar = cantidad * 3739.00;
		resultadoDolar = (double) Math.round(resultadoDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Equivalent to $ " +resultadoDolar+ " Colombian Pesos");
	}
	
	public void ConvertirEurosAPesos(double cantidad) {
		double resultadoEuro = cantidad * 4050.48;
		resultadoEuro = (double) Math.round(resultadoEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Equivalent to $ " +resultadoEuro+ " Colombian Pesos");
	}
	
	public void ConvertirLibrasAPesos(double cantidad) {
		double resultadoLibra = cantidad * 4890.52;
        resultadoLibra = (double) Math.round(resultadoLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Equivalent to $ " +resultadoLibra+ " Colombian Pesos");
	}
	
	public void ConvertirYenAPesos(double cantidad) {
		double resultadoYen = cantidad * 29.68;
        resultadoYen = (double) Math.round(resultadoYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Equivalent to $ " +resultadoYen+ " Colombian Pesos");
	}
	
	public void ConvertirWonAPesos(double cantidad) {
		double resultadoWon = cantidad * 3.04;
        resultadoWon = (double) Math.round(resultadoWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Equivalent to $ " +resultadoWon+ " Colombian Pesos");
	}
}
