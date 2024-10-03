package com.clases;
import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
	private double saldo;
    private Persona titular;
    private int numeroCuenta;
    public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
    
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroDeCuenta();
        listaDeCuentasBancarias.add(this); // Agregar cuenta a la lista
    }

    private int generarNumeroDeCuenta() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Genera un número de 6 dígitos
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes para retirar " + monto);
        }
    }

    public void despliegaInformacion() {
        System.out.println("Número de Cuenta: " + numeroCuenta + ", Saldo: " + saldo);
        titular.despliegaInformacion();
    }

    public static void imprimeInformacionDeTodasLasCuentas() {
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
        }
    }
}
