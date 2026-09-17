public class ContaBancaria {

    String titular;
    double saldoInicial;

    ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }

    
    public static void main(String[] args) {

   
    ContaBancaria conta_felipe = new ContaBancaria("Felipe wolgran", 1000.00);

    System.out.println("A conta do " + conta_felipe.titular + " está com saldo de: $" + conta_felipe.saldoInicial);

    ContaBancaria conta_maria = new ContaBancaria("Maria Silva", 1500.00);

    System.out.println("A conta do " + conta_maria.titular + " está com saldo de: $" + conta_maria.saldoInicial);

    }
}




