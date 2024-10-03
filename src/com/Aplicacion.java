package com;
import com.clases.CuentaBancaria;
import com.clases.Persona;

public class Aplicacion {

	public static void main(String[] args) {
		 // Crear instancias de Persona
        Persona persona1 = new Persona("Juan Pérez", 30);
        Persona persona2 = new Persona("Ana López", 25);
        Persona persona3 = new Persona("Carlos Méndez", 40);

        // Crear instancias de CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(5000, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(3000, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(7000, persona3);

        // Realizar operaciones de depósito y retiro
        cuenta1.depositar(1000);
        cuenta1.retirar(2000);
        
        cuenta2.depositar(500);
        cuenta2.retirar(1000);
        
        cuenta3.depositar(2000);
        cuenta3.retirar(500);

        // Mostrar saldos actuales
        cuenta1.despliegaInformacion();
        cuenta2.despliegaInformacion();
        cuenta3.despliegaInformacion();

        // Imprimir información de todas las cuentas
        System.out.println("----- Información de todas las cuentas -----");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}


