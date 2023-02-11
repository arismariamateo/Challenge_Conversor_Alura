package com.conversor_alura.funciones;


import javax.swing.JOptionPane;


import com.conversor_alura.funciones.InterfazFunciones;
import com.conversor_alura.conversor.Validar;

/**
 * @version 1.0
 * @author Aris Mateo 
 * 
 * Clase FuncionesMonedas extiende a la  clase Validar, con el método OpcionesConversor muestra al ususrio del sistema,
 * las opciones de monedas disponibles para convertir 
 **/


public class FuncionesMonedas extends Validar implements InterfazFunciones {

	String[] opciones = { "De Soles a Dólar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yen",
			"De Soles a Won Coreano", "De Dólar a Soles", "De Euro a Soles", "De Libras a Soles",
			"De Won Coreano a Soles", "De Yen a Soles" };
	
	@Override
	public void OpcionesConversor(){
		
		
		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione opción de conversion",
				"Conversor de Moneda", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

		if (!(opcion == null)) {

			switch (opcion) {

			case "De Soles a Dólar": {
				opcion= "Soles a Dólar";
				ConvertirMonedas(opcion, "PEN", "USD");
				break;
			}
			case "De Soles a Euro": {
				opcion="Soles a Euro"; 
				ConvertirMonedas(opcion, "PEN", "EUR");
				break;
			}
			case "De Soles a Libras": {
				opcion = "Soles a Libras";
				ConvertirMonedas(opcion, "PEN", "GBP");
				break;
			}
			case "De Soles a Yen": {
				opcion= "Soles a Yen";
				ConvertirMonedas(opcion, "PEN", "JPY");
				break;
			}
			case "De Soles a Won Coreano": {
				opcion= "Soles a Won coreano";
				ConvertirMonedas(opcion, "PEN", "KRW");
				break;
			}
			case "De Dólar a Soles": {
				opcion = "Dólares a Soles";
				ConvertirMonedas(opcion, "USD", "PEN");
				break;
			}
			case "De Euro a Soles": {
				opcion = "Euros a Soles";
				ConvertirMonedas(opcion, "EUR", "PEN");
				break;
			}
			case "De Libras a Soles": {
				opcion = "Libras a Soles";
				ConvertirMonedas(opcion, "GBP", "PEN");
				break;
			}
			case "De Won Coreano a Soles": {
				opcion = "Won Coreano a Soles";
				ConvertirMonedas(opcion, "KRW", "PEN");
				break;
			}
			
			case "De Yen a Soles": {
				opcion= "Yen a Soles";
				ConvertirMonedas(opcion, "JPY", "PEN");
				break;
			}
			default: {

			};
			}
		}
	}

}
