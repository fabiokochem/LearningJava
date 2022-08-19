public class ControleBonificacao extends Funcionario {
    private double soma;

    public double getSoma() {
        return this.soma;
    }

    public void registra(Funcionario f){
        this.soma += f.getBonificacao();
    }
}
