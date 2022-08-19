public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Fabio Freire");
        gerente.setCpf("777.777.777-77");
        gerente.setSalario(1000);
        gerente.setSenha(1234);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getSenha());

        System.out.println(gerente.autentica(4321));
        System.out.println(gerente.getBonificacao());
    }
}
