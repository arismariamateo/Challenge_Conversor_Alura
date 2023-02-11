package com.conversor_alura.conversor;


/**
 * @version 1.0
 * @author Aris Mateo
 * 
 * Clase ConvertirTemperatura con el método ObetenerUnidad que recibe los parametros de las unidades de emperatura a convertir 
 * 
 * **/


public class ConvertirTemperatura {


	public double ObtenerUnidad(String unidad, double valor) {
		double resultado = 0.0;
		
		switch(unidad) {
		case "De fahrenheit a celcius": {
			resultado = (valor - 32) * 0.5555;
			break;
		}
		case "De fahrenheit a kelvin": {
			resultado = ((valor - 32) * 0.5555) + 273.15;
			break;
		}
		case "De celcius a fahrenheit":{
			resultado = (valor* 1.8) + 32;
			break;
		}
		case "De celcius a kelvin": {
			resultado = valor + 273.15;
			break;
		}
		case "De kelvin a celcius": {
			resultado = valor - 273.15;
			break;
		}
		case "De kelvin a fahrenheit": {
			resultado = ((valor - 273.15) * 1.8) + 32;
			break;
		}
		default: {};
		}
		return resultado;
	}
}
