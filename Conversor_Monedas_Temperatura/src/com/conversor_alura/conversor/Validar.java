package com.conversor_alura.conversor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



/**
 * @version 1.0  
 * @author Aris Mateo
 * 
 *    
 *  Clase Validar para verificar los datos que ingresa el usuario del sistema, mediante el input, cantidad a convertir y 
 *  mostar el resultado de la conversión se de monedas o de unidades de temperatura, 
**/

public class Validar {
	private double cantidadInicial;
	private double cantidadConvertida;
	private String validarCadena;

/**
*
**/	
	public String ValidarInput(String cadena) {		
		validarCadena = cadena;
		while (true) {			
			if (validarCadena.matches("^[0-9/.]+$")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese un número sin espacios");
				validarCadena = JOptionPane.showInputDialog("Ingrese cantidad a convertir");
			}
		}
		return validarCadena;
	}

	
	public void ConvertirMonedas(String valor, String de_Unidad, String a_Unidad) {
		try (ConvertirMoneda convertir = new ConvertirMoneda()) {
			String input = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
			if (!(input == null)) {
				String cantidad = ValidarInput(input);
				Object conversion = convertir.recibirValores(cantidad, de_Unidad, a_Unidad);
				double redondear = Double.valueOf(conversion.toString());				
				JOptionPane.showMessageDialog(null, cantidad+" "+valor+", recibirá: " + String.valueOf((double)Math.round(redondear*100d)/100)+""+a_Unidad+"");
			}
		} catch (Exception ex) {
			Logger.getLogger(com.conversor_alura.principal.Principal.class.getName()).log(Level.SEVERE, null, ex);
			ex.printStackTrace();
		}
	}
	
	
	public void ConvertirUnidadTemperatura(String unidad) {
		ConvertirTemperatura convertir = new ConvertirTemperatura();
		String input = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");		
		if (!(input == null)) {
			cantidadInicial = Double.parseDouble(ValidarInput(input));			
			cantidadConvertida = convertir.ObtenerUnidad(unidad, cantidadInicial);			
			JOptionPane.showMessageDialog(null, "La cantidad a convertir  "+input+"  "+unidad+" es "+ (double)Math.round(cantidadConvertida*100d)/100);
		}
		return;
	}
}
