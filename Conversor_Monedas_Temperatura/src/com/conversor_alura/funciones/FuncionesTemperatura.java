package com.conversor_alura.funciones;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.conversor_alura.conversor.Validar;
import com.conversor_alura.funciones.InterfazFunciones;

/**
 * @version 1.0
 * @author Aris Mateo
 * 
 * Clase FuncionesTemperatura extiende a la  clase Validar, con el método OpcionesConversor muestra al usuario del sistema,
 * las opciones de unidades de temperatura disponibles para convertir 
 * 
 **/


public class FuncionesTemperatura extends Validar implements InterfazFunciones {

	private String[] opciones = { "De celcius a fahrenheit", "De celcius a kelvin", "De fahrenheit a celcius",
			"De fahrenheit a kelvin", "De kelvin a celcius", "De kelvin a fahrenheit" };

	@Override
	public void OpcionesConversor() {
		Icon icono = new ImageIcon("imagenes/cambioT.png");
		String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversion",
				"Conversor de unidades de temperatura", JOptionPane.DEFAULT_OPTION, icono, opciones,
				opciones[0]);

		if (!(opcion == null)) {

			switch (opcion) {

			case "De celcius a fahrenheit": {
				ConvertirUnidadTemperatura("De celcius a fahrenheit");
				break;
			}
			case "De celcius a kelvin": {
				ConvertirUnidadTemperatura("De celcius a kelvin");
				break;
			}
			case "De fahrenheit a celcius": {
				ConvertirUnidadTemperatura("De fahrenheit a celcius");
				break;
			}
			case "De fahrenheit a kelvin": {
				ConvertirUnidadTemperatura("De fahrenheit a kelvin");
				break;
			}
			case "De kelvin a celcius": {
				ConvertirUnidadTemperatura("De kelvin a celcius");
				break;
			}
			case "De kelvin a fahrenheit": {
				ConvertirUnidadTemperatura("De kelvin a fahrenheit");
				break;
			}
			default: {};
			}
		}
	}


}
