public class ContaTerminal {
    int numero = 1021;
    String agencia = "067-8";
    String nomeCliente = "Mario Andrade";
    double saldo = 237.48;

    public String nome(){
        return nomeCliente;
    }
    public String numeroAgencia(){
        return agencia;
    }

    public int numeroConta(){
        return numero;
    }

    public double valorDeSaldo(){
        return saldo;
    }

}
