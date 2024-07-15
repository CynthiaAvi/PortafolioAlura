package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosADolares(double monto) {
		double dolares = monto / 3739.00;
		dolares = (double) Math.round(dolares * 100d) / 100;
        JOptionPane.showMessageDialog(null, "You have $ " + dolares + " USD");
	}
	
	public void ConvertirPesosAEuros(double monto) {
		double euros = monto / 4050.48;
		euros = (double) Math.round(euros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "You have € " + euros + " Euros");
	}
	
	public void ConvertirPesosALibras(double monto) {
		double libras = monto / 4890.52;
        libras = (double) Math.round(libras * 100d) / 100;
        JOptionPane.showMessageDialog(null, "You have £ " + libras + " Pounds");
	}
	
	public void ConvertirPesosAYen(double monto) {
		double yen = monto / 29.68;
        yen = (double) Math.round(yen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "You have ¥ " + yen + " Yen");
	}
	
	public void ConvertirPesosAWon(double monto) {
		double won = monto / 3.04;
        won = (double) Math.round(won * 100d) / 100;
        JOptionPane.showMessageDialog(null, "You have ₩ " + won + " Won");
	}
}
