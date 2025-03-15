package tema1.problema05;

public class Principal {
    public static void main(String[] args) {
        Cuenta[] cuentas = new Cuenta[1];
        cuentas[0] = new Cuenta(31243124, 20000.54);;

        Cliente cliente = new Cliente("Juan", "González", "06785432L", cuentas);

        cliente.ingresarDinero(0, 7300);
        cliente.retirarDinero(0, 10000.93);
        double saldo = cliente.consultarSaldo(0);
        System.out.println("Su saldo en la cuenta seleccionada es: " + saldo);
    }
}
