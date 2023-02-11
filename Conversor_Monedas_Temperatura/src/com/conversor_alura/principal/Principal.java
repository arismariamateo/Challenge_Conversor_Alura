package com.conversor_alura.principal;


import javax.swing.JOptionPane;
import com.conversor_alura.funciones.FuncionesMonedas;
import com.conversor_alura.funciones.FuncionesTemperatura;

/**
 * @version 1.0
 * @author Aris Mateo
 * Challenge ONE Alura Latam: Sistema Conversor con las opciones para convertir Monedas y Unidades de Temperatura.
 * El ejemplo utiliza la moneda Soles con el PEN - Soles Peruano
 * Las conversiones de monedas se ejecutan en tiempo real utilizando la api apilayer.
 * 
 *  Clase Principal, Inicia el Sistema  
**/

public class Principal {

	public static void main(String[] args) {

		FuncionesMonedas moneda = new FuncionesMonedas();
		FuncionesTemperatura temperatura = new FuncionesTemperatura();

		String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
	

		while (true) {
			String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione opción de conversion", "Conversor",
					JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

			if (!(opcion == null)) {
				if (opcion.equals("Conversor de Moneda"))
					moneda.OpcionesConversor();

				if (opcion.equals("Conversor de Temperatura"))
					temperatura.OpcionesConversor();
			}

			int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Conversor de Moneda",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			// 0=yes, 1=no, 2=cancel
			if (ventanaYesNotCancel == 1 || ventanaYesNotCancel == 2) {
				JOptionPane.showMessageDialog(null, "Programa Terminado");
				System.exit(0);
			}
		}
	}
	
}
