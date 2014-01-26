package com.lquispe.tool;

public class SintaxisJava {

	public static void main(String[] args) {
		InicializarObjetos();
		EstructurasControl();
	}

	public static void InicializarObjetos(){
		  //Enteros
        int numero = 1000;
        //Texto
        String cadenaTexto = "Esto es texto";
        //Decimales
        double decimal = 12.62;
        //Booleanos
        boolean bool = false;
        //Arreglos
        int [] arreglo1 = new int [] {0,10,20,30,40,50};
        System.out.println(arreglo1[2]);
	}
	
	public static void EstructurasControl(){
		/*
		 * Condicionales - IF SWITCH
		 */
		boolean condicion = true;
		if(condicion){
			System.out.println("IF: Es verdad");
		}
		else {
			System.out.println("IF: Es falso");
		}
		
		int numero = 5;
		switch(numero){
		case 0: //CODIGO
			break;
		case 10: //CODIGO 
			break;
		default: System.out.println("SWITCH: El número no corresponde a la condicion: "+numero);
			break;
		}
		
		/**
		 * Repetitivas - FOR WHILE
		 */
		int suma = 0;
		for(int i=0; i<10; i++){
			suma++;
		}
		System.out.println("FOR: "+suma);
		
		int b = 0;
		while(b<=5){
			b++;
		}
		System.out.println("WHILE: "+b);
	}
	
}
