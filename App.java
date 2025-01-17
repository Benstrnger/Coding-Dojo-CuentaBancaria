public class App {
    
    public static void main(String[] args) {

        Persona Benjamin = new Persona("Benjamin", 22);

        Persona Frijo = new Persona("Frijo", 24);

        Persona Velka = new Persona("Velka", 28);

        
        CuentaBancaria CuentaBenjamin = new CuentaBancaria(10000, Benjamin);
        
        CuentaBancaria CuentaFrijo = new CuentaBancaria(900000, Frijo);
        
        CuentaBancaria CuentaVelka = new CuentaBancaria(4000000, Velka);

        CuentaFrijo.depositar(10000);
       
        CuentaBenjamin.retirar(5000);

        CuentaVelka.depositar(500);

        System.out.println("El saldo de "+Benjamin.getNombre()+" es de: $"+CuentaBenjamin.getSaldo());
        System.out.println("El saldo de "+Frijo.getNombre()+" es de: $"+CuentaFrijo.getSaldo());
        System.out.println("El saldo de "+Velka.getNombre()+" es de: $"+CuentaVelka.getSaldo());

        CuentaBenjamin.imprimeInformacionDeTodasLasCuentas();

    }

        
}
