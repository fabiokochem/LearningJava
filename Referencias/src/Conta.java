public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100; // isso significa que toda conta começa 100 reais de saldo (quem dera hihi)
        System.out.println("criando uma nova conta");
        total++;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}

