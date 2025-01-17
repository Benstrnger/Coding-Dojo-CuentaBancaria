import java.util.ArrayList;
import java.util.Random;
public class CuentaBancaria {
    
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    
    private static ArrayList<CuentaBancaria> listaDeCuentaBancarias = new ArrayList<CuentaBancaria>();

    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        // Nosotros debemos de generar ese #
        Random random = new Random();
        this.numeroCuenta=100000 + random.nextInt(900000);

        CuentaBancaria.listaDeCuentaBancarias.add(this);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    } 

    public void retirar(double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
        } else {
            System.out.println("Saldo Insuficiente :");
        }
    }

    public void despliegaInformacion() {
        // Muestra la información de la cuenta incluyendo la información del titular.
        System.out.println("Titular: "+titular.getNombre());
        System.out.println("Edad: "+titular.getEdad());
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Numero de Cuenta: "+this.numeroCuenta);
    }

    public void imprimeInformacionDeTodasLasCuentas() {
        // Método estático que recorre la lista de cuentas bancarias e imprime su información.
        for (CuentaBancaria c : CuentaBancaria.listaDeCuentaBancarias) {
            System.out.println("---------------------------------");
            System.out.println("Titular: "+c.titular.getNombre());
            System.out.println("Saldo: "+c.getSaldo());
            System.out.println("Numero de Cuenta: "+c.getNumeroCuenta());
            
        }
    }
}
