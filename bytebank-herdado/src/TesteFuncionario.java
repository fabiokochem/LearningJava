public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fabio");
        funcionario.setCpf("755.859.106-12");
        funcionario.setSalario(2900);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
