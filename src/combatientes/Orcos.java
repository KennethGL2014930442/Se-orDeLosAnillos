package src.combatientes;

import src.dados.*;

public class Orcos extends Bestias{
	
	private static int contadorInstancias;

    public static int getInstancias(){
        return Orcos.contadorInstancias;
    }

    public Orcos(String nombre){
        super(nombre, 300, 5);
		Orcos.contadorInstancias++;
    }

}