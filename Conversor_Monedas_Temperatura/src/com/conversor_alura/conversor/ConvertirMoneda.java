package com.conversor_alura.conversor;

import java.io.IOException;

import org.json.JSONObject;

import com.conversor_alura.api.ConexionApi;


/**
 * @version 1.0
 * @author Aris Mateo
 *  
 * Clase ConvertirMoneda, con el método recibirValores para convertir los tipos monedas seleccionadas 
 * por el usuario del sistema y llama a la api "apilayer"de conversion en tiempo real de las monedas 

 * 
 **/

public class ConvertirMoneda implements AutoCloseable {
		
	ConexionApi convertir = new ConexionApi();
	
	
	public Object recibirValores(String valor, String de_Moneda, String a_Moneda)
			throws IOException {

		JSONObject response = convertir.run("https://api.apilayer.com/exchangerates_data/convert?from=" + de_Moneda + "&to="
				+ a_Moneda + "&amount=" + valor);
		System.out.println("https://api.apilayer.com/currency_data/convert?from=" + de_Moneda + "&to=" + a_Moneda	+ "&amount=" + valor);
		return response.get("result");
	}
	
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
