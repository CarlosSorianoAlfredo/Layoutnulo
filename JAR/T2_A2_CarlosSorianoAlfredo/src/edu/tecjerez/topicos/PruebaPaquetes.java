
/*
 * PAQUETES
 * 		Son DIRECTORIOS normales y/o comprimidos (JAR) que contienen los archivos BYTECODE
 * 		para la ejecucion de programas en java
 * 
 * 		Pueden contener otros archivos como c�digo fuente, documentos, sonido, imagenes, videos, etc.
 * 
 * 
 * 	Para crear y nombrar paquetes se sigue una convenci�n:
 * 		
 * 		-Dominio del sitio web de la empresa/instituci�n a la inversa
 * 
 * 			EJEMPLO: www.tecjrez.edu.mx
 * 					PAQUETE: edu.tecjrez	
 * 
 * 		Se debe declarar al inicio del codigo fuente, antes de las importaciones de otros paquetes 
 * 		atraves de la palabra reservada PACKAGE
 */


package edu.tecjerez.topicos;

import java.util.Scanner;

import javax.swing.SwingUtilities;

import edu.tecjerez.topicos.vista.VentanaInicio;


public class PruebaPaquetes {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
		
	}

}
